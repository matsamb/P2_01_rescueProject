package com.hemebiotech.symptomWriter;


/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */

public interface ISymptomWriter {
	
	/**
	 * 
	 * Writes symptoms concatenated with their respective occurrence 
	 * to an old or new file.  
	 */
	
	void writeSymptomAndOccurenceToFile();
}
