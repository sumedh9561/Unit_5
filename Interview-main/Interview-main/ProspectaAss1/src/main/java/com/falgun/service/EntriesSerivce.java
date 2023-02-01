package com.falgun.service;

import java.util.List;

import com.falgun.exceptions.InvalidEntryException;
import com.falgun.models.Entries;

public interface EntriesSerivce {
	
	public String saveEntry(Entries entries)throws InvalidEntryException; 
	public List<Entries> getAllEntries(); 

}
