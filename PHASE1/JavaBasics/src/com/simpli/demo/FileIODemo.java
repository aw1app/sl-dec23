package com.simpli.demo;

import java.io.File;

public class FileIODemo {

	public static void main(String[] args) {
		String myFile = "F:\\Users\\home\\git\\sl-dec23\\PHASE1\\JavaBasics\\src\\com\\simpli\\demo\\log.txt";
		String myFolder = "F:\\Users\\home\\git\\sl-dec23\\PHASE1\\JavaBasics\\src\\com\\simpli\\demo";

		File f = new File(myFile);

		System.out.printf("File %s exists=%s \n", myFile, f.exists());
		System.out.printf("File %s is executable =%s \n", myFile, f.canExecute());
		System.out.printf("File %s is readable =%s \n", myFile, f.canRead());
		System.out.printf("File %s is writable =%s \n", myFile, f.canWrite());
		System.out.printf("File %s size is =%s \n", myFile, f.length());
		
		
		
		File folder = new File(myFolder);
		System.out.printf("File %s exists=%s \n", myFolder, folder.exists());
		System.out.printf("File %s is a directory=%s \n", myFolder, folder.isDirectory());
		
		if(folder.isDirectory()) {
			
			String[] fileList = folder.list();
			System.out.println("List of files in "+ folder.getAbsolutePath() + ":");
			
			for (String file: fileList)
				System.out.println(file);
			
		}
		

	}

}
