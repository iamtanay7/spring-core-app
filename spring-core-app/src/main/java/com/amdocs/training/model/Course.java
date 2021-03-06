package com.amdocs.training.model;

public class Course {
	private int courseId;
	private String courseName;
	//fee desc resc
	private double fee;
	private String description;
	private String resources;
	public Course() {}
	
	public Course(int courseId, String courseName, double fee, String description, String resources) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.fee = fee;
		this.description = description;
		this.resources = resources;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getResources() {
		return resources;
	}
	public void setResources(String resources) {
		this.resources = resources;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", fee=" + fee + ", description="
				+ description + ", resources=" + resources + "]";
	}
	
	
}

