package com.Exercise2.code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileUpper {

	public static String convertUpper(String filePath) {
		try {
			FileReader file = new FileReader(filePath);
			BufferedReader br = new BufferedReader(file);
			for (String line; (line = br.readLine()) != null;) {

				String Upper = line.toUpperCase();
				return Upper;
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String findLength(String filePath) {
		try {
			File f = new File(filePath);
			double len = f.length();
			String leng = Double.toString(len);

			return leng;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
