package com.example.myandroidapp;

import java.util.List;

import com.facebook.model.GraphPlace;
import com.facebook.model.GraphUser;

import android.app.Application;

public class MyAndroidApp extends Application {
	
	private List<GraphUser> selectedUsers;
	private GraphPlace selectedPlace;
	
	
	public void setSelectedUsers(List<GraphUser> users) {
	    selectedUsers = users;
	}

	public List<GraphUser> getSelectedUsers() {
		    return selectedUsers;
		}
	
	public GraphPlace getSelectedPlace() {
	    return selectedPlace;
	}

	public void setSelectedPlace(GraphPlace place) {
	    this.selectedPlace = place;
	}

	}
	
