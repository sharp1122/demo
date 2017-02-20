package com.sharp.demo.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtil {

	public static String readFile(String path) {
		
		String result = "";
		
		InputStream inputStream = null;
		InputStreamReader inputReader = null;
		BufferedReader reader = null;
		try {
			inputStream = FileUtil.class.getResourceAsStream(path);	
			
			inputReader = new InputStreamReader(inputStream);
			
			reader = new BufferedReader(inputReader);
			
			String line = null;
			while ((line = reader.readLine()) != null) {
				result += line;
			}
			
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputReader != null) 
					inputReader.close();
				if (inputStream != null)
					inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		return result;
	}
}
