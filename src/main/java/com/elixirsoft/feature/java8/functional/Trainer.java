package com.elixirsoft.feature.java8.functional;

import java.util.List;

public class Trainer {
	private String name;
	private int yearOfExperience;
	private String title;
	private String gender;
	private boolean isOnline;
	private List<String> courses;

	public Trainer(String name, int yearOfExperience, String title, String gender, boolean isOnline,
			List<String> courses) {
		super();
		this.name = name;
		this.yearOfExperience = yearOfExperience;
		this.title = title;
		this.gender = gender;
		this.isOnline = isOnline;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
}
