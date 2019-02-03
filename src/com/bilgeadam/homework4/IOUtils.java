package com.bilgeadam.homework4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IOUtils {
	
	public static String FileReader(String path) {
		String context = "";
		
		try(BufferedReader r = new BufferedReader(new FileReader(new File(path)))) {
			String line = "";
			
			while((line = r.readLine()) != null) {
				context += line + "\n";
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		return context;
	}
	
	public static void FileWriter (String content, String path) {
		try (Writer w = new BufferedWriter(new FileWriter(new File(path)))){
			w.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
