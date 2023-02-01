package com.falgun.models;

import java.util.List;


public class Data {
	
	private Integer count;
    
    private List<Entries> entries;
    
    
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<Entries> getEntries() {
		return entries;
	}
	public void setEntries(List<Entries> entries) {
		this.entries = entries;
	}

}
