package com.hemebiotech.symptomReader;

import java.util.List;
 
/**
 * This Interface aims to return lines of a source file as Strings
 * 
 */
public interface ISymptomReader {
	/**
	 * 
	 * @return a List of Symptoms as List of Strings from a data source where 
	 * there is one symptom per line, duplicates are possible.
	 */
	List<String> getSymptoms ();
}
