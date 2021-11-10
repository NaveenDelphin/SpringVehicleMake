package com.insurance.auto.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Makeext {
	private int Count;
	private String Message;
	private String SearchCriteria;
	private List<MakeResults> Results;
	@JsonProperty("Count")
	public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
	@JsonProperty("Message")
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	@JsonProperty("SearchCriteria")
	public String getSearchCriteria() {
		return SearchCriteria;
	}
	public void setSearchCriteria(String searchCriteria) {
		SearchCriteria = searchCriteria;
	}
	@JsonProperty("Results")
	public List<MakeResults> getResults() {
		return Results;
	}
	public void setResults(List<MakeResults> results) {
		Results = results;
	}
	@Override
	public String toString() {
		return "Makeext [Count=" + Count + ", Message=" + Message + ", SearchCriteria=" + SearchCriteria + ", Results="
				+ Results + "]";
	}
	
}
