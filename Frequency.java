package com.Exercise2.code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
	public static String countWordFrequency(String fileName, Map<String, Integer>words) throws FileNotFoundException {
	
			try{
				Scanner file= new Scanner(new File(fileName));
			

		while(file.hasNext()) {
			String word =file.next();

			Integer count = words.get(word);

			if(count!= null)
				count++;
			else
				count=1;
			words.put(word, count);
		}
		
		file.close();
		String str="";
		str=str+words;
		return str;
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();

			}
			return null;
		
					}
		
	
}
