package com.cg.washer.services;

import java.util.List;

import com.cg.washer.models.Washers;

public interface WasherService {

	public void save(Washers washer);

	public void updateWasherDetails( Washers washer);

	public List<Washers> getWashers();

	void deleteWasher(int id);

	public long getSequenceNumber(String sequenceName);
	
	public  Washers viewWasher(int id);



	//Washers updateWasherDetails(Washers washer);
}
