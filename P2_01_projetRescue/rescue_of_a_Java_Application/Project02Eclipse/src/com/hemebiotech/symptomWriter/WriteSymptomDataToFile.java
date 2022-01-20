package com.hemebiotech.symptomWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/**
 * The class WriteSymptomDataToFile opens a file, writes to a new or old file
 * each String element of an ArrayList of symptoms with respective occurrence on
 * a line.
 * 
 * @author matondo lusamba
 *
 */

public class WriteSymptomDataToFile implements ISymptomWriter {

	Map<String, Integer> mapOfSymptomAndOccurrence;
	String filepath;

	/**
	 * construct an object of this class
	 * 
	 * @param mapOfsymptomAndOccurrence
	 * @param filepath
	 */
	public WriteSymptomDataToFile(Map<String, Integer> mapOfSymptomAndOccurrence, String filepath) {
		this.mapOfSymptomAndOccurrence = mapOfSymptomAndOccurrence;
		this.filepath = filepath;
	}

	/**
	 * Implements the writeSymptomAndOccurenceToFile() method from Interface
	 * {@link ISymptomWriter}
	 * 
	 * Writes from a String as key and Integer as value HashMap of symptoms and
	 * respective occurrence to an old or new file.
	 */

	public void writeSymptomAndOccurenceToFile() {
		if (filepath != null) {

			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));

				this.mapOfSymptomAndOccurrence.entrySet().stream().forEach(SymptomAndOccurrence -> {
					try {
						writer.write(SymptomAndOccurrence + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
				writer.flush();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
