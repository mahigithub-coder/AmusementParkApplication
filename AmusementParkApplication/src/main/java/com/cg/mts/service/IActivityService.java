package com.cg.mts.service;

import java.util.List;

import com.cg.mts.entities.Activity;

public interface IActivityService {
	
	
	public Activity insertCab(Activity activity);
	public Activity updateCab(Activity activity);
	public Activity deleteCab(Activity activity);
	public List<Activity> viewActivitiesOfCharges(float charges);
	public int countActivitiesOfCharges(float charges);
}
	
	
	
	
	
	
	


