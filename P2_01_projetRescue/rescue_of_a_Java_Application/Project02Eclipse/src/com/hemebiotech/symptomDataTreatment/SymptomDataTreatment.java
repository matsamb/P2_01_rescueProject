package com.hemebiotech.symptomDataTreatment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The class SymptomDataTreatment transforms a List of Strings where element can
 * be repeated, into an other List of Strings, without repetition, where input
 * List's element are concatenated with their respective occurrence.
 * 
 * @author matondo lusamba
 *
 */

public class SymptomDataTreatment implements ISymptomDataTreatment {

	private List<String> symptomsList;
	private Map<String, Integer> symptomsMapWithOccurrences = new HashMap<>();

	/**
	 * construct an object of this class
	 *  
	 * @param symptomsList
	 */
	public SymptomDataTreatment(List<String> symptomsList) {

		this.symptomsList = symptomsList;
	}

	/**
	 * Implement the mapOfSymptomsWithOccurrences() method from Interface
	 * {@link ISymptomDataTreatment}.
	 * 
	 * @return a List of Strings, each String containing a symptom and it
	 *         occurrence.
	 */

	@Override 
	public Map<String, Integer> mapOfSymptomsWithOccurrences() {

		this.symptomsList.forEach(symptom -> symptomsMapWithOccurrences.put(symptom,
				symptomsMapWithOccurrences.getOrDefault(symptom, 0) + 1));
		

		return symptomsMapWithOccurrences;
	}
}
