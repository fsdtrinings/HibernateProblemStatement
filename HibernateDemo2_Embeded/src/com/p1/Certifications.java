package com.p1;

import javax.persistence.Embeddable;

@Embeddable
public class Certifications {
	
	private String certificationName;
	private char grade;
	public Certifications() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certifications(String certificationName, char grade) {
		super();
		this.certificationName = certificationName;
		this.grade = grade;
	}
	public String getCertificationName() {
		return certificationName;
	}
	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}

	
	
}
