package com.package1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassComP1 {

	private String startTime;

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public void startTime() {
		DateFormat dF = new SimpleDateFormat("dd-MM-yyy HH:mm:ss");
		setStartTime(dF.format(new Date()));
		System.out.println(getStartTime());
	}
	
}
