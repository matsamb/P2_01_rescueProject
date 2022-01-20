package com.hemebiotech.symptomReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The class ReadSymptomDataFromFile opens a file, reads and stores each line in a String and 
 * finally gathers them as a List of Strings where element can be repeated. 
 * 
 * @author 
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	private List<String> result = new ArrayList<>() ;
	
	/**
	 * 
	 * @param filepath states the path to a file with symptoms ordered one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	/**
	 * Implement the GetSymptoms() method from Interface {@link ISymptomReader}
	 * 
	 * @return a List of Symptoms as List of Strings from a data source where 
	 * there is one symptom per line, duplicates are possible.
	 */
	@Override
	public List<String> GetSymptoms() {
		
		try {
			result = Files.lines(Paths.get(filepath)).collect(Collectors.toList());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return result;
	}

}