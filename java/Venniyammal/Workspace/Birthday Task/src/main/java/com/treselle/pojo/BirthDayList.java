package com.treselle.pojo;

import java.util.ArrayList;
import java.util.List;
public class BirthDayList {
	private List<BirthDay> birthDayList = new ArrayList<BirthDay>();
	public List<BirthDay> getBirthDayList() {
		return birthDayList;
	}
	public void setBirthDayList(List<BirthDay> birthDayList) {
		this.birthDayList = birthDayList;
	}
}