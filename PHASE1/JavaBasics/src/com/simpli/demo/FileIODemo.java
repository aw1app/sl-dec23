package com.simpli.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class FileIODemo {
	static String myFile = "F:\\Users\\home\\git\\sl-dec23\\PHASE1\\JavaBasics\\src\\com\\simpli\\demo\\log.txt";
	static String myFile2 = "F:\\Users\\home\\git\\sl-dec23\\PHASE1\\JavaBasics\\src\\com\\simpli\\demo\\log1.txt";
	static String myFile3 = "F:\\Users\\home\\git\\sl-dec23\\PHASE1\\JavaBasics\\src\\com\\simpli\\demo\\log3.txt";
	static String myFolder = "F:\\Users\\home\\git\\sl-dec23\\PHASE1\\JavaBasics\\src\\com\\simpli\\demo";

	public static void main(String[] args) {

		// fileClassDemo();
		// fileReadDemo();

		// fileReadDemo2();
		// fileCopyDemo();
		
		fileWritingDemo1();
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
