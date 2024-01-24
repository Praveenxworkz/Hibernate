package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Certificate {

	@Column(name = "course")
	private String course;
	@Column(name = "duration")
	private String duration;
	
	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	
	public Certificate() {
		System.out.println("certificate object is created");
	}

	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Certificate [course=" + course + ", duration=" + duration + "]";
	}
	
	
	
}
