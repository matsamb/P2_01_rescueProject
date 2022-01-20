package com.hemebiotech.analytics;

import com.hemebiotech.symptomDataTreatment.ISymptomDataTreatment;
import com.hemebiotech.symptomDataTreatment.SymptomDataTreatment;
import com.hemebiotech.symptomReader.ISymptomReader;
import com.hemebiotech.symptomReader.ReadSymptomDataFromFile;
import com.hemebiotech.symptomWriter.ISymptomWriter;
import com.hemebiotech.symptomWriter.WriteSymptomDataToFile;

/**
 * This class contains the main method that writes a list of symptoms read from
 * a text file to an other file. The input file contains several lines ( a
 * symptom per line ) with possible repeat. Then, those symptoms are listed and
 * matched with their occurrences in a String and stored as a List of Strings
 * without repeat. Finally, each element of the latest List is written ( one
 * element per line ) in a new or an existing file.
 * 
 * @author matondo lusamba
 *
 */

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {	    

		ISymptomReader symptomsReader = new ReadSymptomDataFromFile("P2_01_projetRescue\\symptoms.txt");

		ISymptomDataTreatment symptomsDataTreatment = new SymptomDataTreatment(symptomsReader.getSymptoms());
		
		ISymptomWriter symptomsWriter = new WriteSymptomDataToFile(symptomsDataTreatment.mapOfSymptomsWithOccurrences(),
				"result.out");

		symptomsWriter.writeSymptomAndOccurenceToFile();

	}

}
