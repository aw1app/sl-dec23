package com.simpli.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

import people.staff.Doctor;

public class FileIODemo {
	static String myFile = "F:\\Users\\home\\git\\sl-dec23\\PHASE1\\JavaBasics\\src\\com\\simpli\\demo\\log.txt";
	static String myFile2 = "F:\\Users\\home\\git\\sl-dec23\\PHASE1\\JavaBasics\\src\\com\\simpli\\demo\\log1.txt";
	static String myFile3 = "F:\\Users\\home\\git\\sl-dec23\\PHASE1\\JavaBasics\\src\\com\\simpli\\demo\\log3.txt";
	static String doctor1File = "F:\\Users\\home\\git\\sl-dec23\\PHASE1\\JavaBasics\\src\\com\\simpli\\demo\\doctor1.txt";
	static String myFolder = "F:\\Users\\home\\git\\sl-dec23\\PHASE1\\JavaBasics\\src\\com\\simpli\\demo";

	public static void main(String[] args) {

		// fileClassDemo();
		// fileReadDemo();

		// fileReadDemo2();
		// fileCopyDemo();

		// fileWritingDemo1();

		// fileAppendingWritingDemo1();

		//objectSerializationDemo();
		
		objectDeSerializationDemo();
	}

	// Challenge:
	// Given a file location, replace Friday in it with Monday.
	// Read all lines of the file Files. List<String> lines =
	// Files.readAllLines(filePath);
	// Loop thru all the lines in the list and check if it contains Friday.
	// If it contains, use String's replace method and write back the lines using a
	// FileWriter

	public static void objectDeSerializationDemo() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(doctor1File);
			ois = new ObjectInputStream(fis);

			Object obj = ois.readObject();
			
			Doctor d = (Doctor)obj;
			
			System.out.printf("Name %s and age=%s \n",d.name,d.age);
			
		} catch (IOException | ClassNotFoundException e) {

		}finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
			}
		}
	}

	public static void objectSerializationDemo() {

		Doctor d1 = new Doctor("Sharon", 50);
		d1.age = 75;

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(doctor1File);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(d1);

			System.out.println("Doctor object is written to a serilized file.");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
			}
		}

	}

	public static void fileAppendingWritingDemo1() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(myFile3, true);

			fw.write("\n I am now appending this line\n");
			fw.write("This line too");

			System.out.println("Appended 2 lines to the file. pls check it out");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void fileWritingDemo1() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(myFile3);

			fw.write("The weather is awesome today\n");
			fw.write("Hope it will be same tomorrow");

			System.out.println("Wrote 2 lines to the file. pls check it out");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void fileCopyDemo() {
		Path filePath = Path.of(myFile);
		Path filePath2 = Path.of(myFile2);
		try {
			Files.copy(filePath, filePath2, StandardCopyOption.REPLACE_EXISTING);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fileReadDemo2() {
		try {
			Path filePath = Path.of(myFile);
			List<String> lines = Files.readAllLines(filePath);

			for (String s : lines)
				System.out.println(s);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fileReadDemo1() {
		FileReader fr = null;
		try {
			fr = new FileReader(myFile);

			int ch = fr.read();
			System.out.println(ch);
			ch = fr.read();
			System.out.println(ch);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	public static void fileClassDemo() {
		File f = new File(myFile);

		System.out.printf("File %s exists=%s \n", myFile, f.exists());
		System.out.printf("File %s is executable =%s \n", myFile, f.canExecute());
		System.out.printf("File %s is readable =%s \n", myFile, f.canRead());
		System.out.printf("File %s is writable =%s \n", myFile, f.canWrite());
		System.out.printf("File %s size is =%s \n", myFile, f.length());

		File folder = new File(myFolder);
		System.out.printf("File %s exists=%s \n", myFolder, folder.exists());
		System.out.printf("File %s is a directory=%s \n", myFolder, folder.isDirectory());

		if (folder.isDirectory()) {

			String[] fileList = folder.list();
			System.out.println("List of files in " + folder.getAbsolutePath() + ":");

			for (String file : fileList)
				System.out.println(file);

		}

	}

}
