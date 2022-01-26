package com.cg.mts.repository;

import java.util.List;

import com.cg.mts.entities.Activity;
import com.cg.mts.exception.ActivityNotFoundException;

public interface IActivityRepository {

	
	public Activity insertCab(Activity activity);
	public Activity updateCab(Activity activity) throws ActivityNotFoundException;
	public Activity deleteCab(Activity activity) throws ActivityNotFoundException;
	public List<Activity> viewActivitiesOfCharges(float charges);
	public int countActivitiesOfCharges(float charges);
}
