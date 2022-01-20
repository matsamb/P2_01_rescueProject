package com.hemebiotech.symptomDataTreatment;

import java.util.Map;

/**
 * 
 * This Interface transforms a List of Strings with possible repetition to an other List of Strings without 
 * repetition where elements of the input List are concatenated to their respective occurrence. 
 * 
 * @author matlu
 *
 */

public interface ISymptomDataTreatment {
	
	/**
	 * @return symptoms mapped to their respective occurrence, as a Map of Strings and Integer.
	 */

	Map<String, Integer> MapOfSymptomsWithOccurrences();


}
