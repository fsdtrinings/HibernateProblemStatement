package com.p1;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity   // HQL 
@Table(name="MyStudents")
@NamedQuery(name="student.queryToGetStudent",query="From Student where id=?1")
@NamedQueries(
		{
			@NamedQuery(name="",query=""),
			@NamedQuery(name="",query="")
		})
public class Student{

	@Id
	@SequenceGenerator(name="mylogic",initialValue=1100,allocationSize=11)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic")
	private int id;
	
	@Column(name="Student_Name",nullable=false)
	private String name;
	
	@Embedded
	private Address permenentAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="houseNum",column=@Column(name="Temporary_HouseNum",nullable=true)),
		@AttributeOverride(name="city",column=@Column(name="Temporary_City",nullable=true))
	})
	private Address tempAddress;
	
	private int marks;
	
	
	
	
	@ElementCollection
	@CollectionTable(name="Certifications",joinColumns=@JoinColumn(name="CertificationInfo"))
	@GenericGenerator(name="myStrategy",strategy="sequence")
	@CollectionId(columns={@Column(name="CertificationID")},generator="myStrategy",type=@Type(type="long"))
	private List<Certifications> certificationsList = new ArrayList<Certifications>();
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, Address permenentAddress, Address tempAddress, int marks) {
		super();
		this.name = name;
		this.permenentAddress = permenentAddress;
		this.tempAddress = tempAddress;
		this.marks = marks;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getPermenentAddress() {
		return permenentAddress;
	}


	public void setPermenentAddress(Address permenentAddress) {
		this.permenentAddress = permenentAddress;
	}


	public Address getTempAddress() {
		return tempAddress;
	}


	public void setTempAddress(Address tempAddress) {
		this.tempAddress = tempAddress;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}

	

	public List<Certifications> getCertificationsList() {
		return certificationsList;
	}


	public void setCertificationsList(List<Certifications> certificationsList) {
		this.certificationsList = certificationsList;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", permenentAddress=" + permenentAddress + ", tempAddress="
				+ tempAddress + ", marks=" + marks + "]";
	}


	
	
	
	
	
	
}//end class
