package com.package3;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.package1.ClassComP1;

public class ClassP3 {
	private String endTime;

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public void program() {
		ClassComP1 p1 = new ClassComP1();
		System.out.println("Start Time: " + p1.getStartTime());
		DateFormat dF = new SimpleDateFormat("dd-MM-yyy HH:mm:ss");
		setEndTime(dF.format(new Date()));
		System.out.println("End Time: " + getEndTime());
	}
	
	
}
