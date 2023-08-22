package com.csv_to_rdbms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @Column(name = "subjectId")
    private Integer subjectId;

    @Column(name = "ageMonths")
    private Integer ageMonths;

    @Column(name = "gender")
    private String gender;

    @Column(name = "heightInches")
    private Double heightInches;

    @Column(name = "weightLbs")
    private Double weightLbs;

    @Column(name = "legLengthInches")
    private Double legLengthInches;

    @Column(name = "speedMetersPerSec")
    private Double speedMetersPerSec;

    @Column(name = "group_column")
    private String group;
    
	public DataEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataEntity(Long id, Integer subjectId, Integer ageMonths, String gender, Double heightInches,
			Double weightLbs, Double legLengthInches, Double speedMetersPerSec, String group) {
		this.id = id;
		this.subjectId = subjectId;
		this.ageMonths = ageMonths;
		this.gender = gender;
		this.heightInches = heightInches;
		this.weightLbs = weightLbs;
		this.legLengthInches = legLengthInches;
		this.speedMetersPerSec = speedMetersPerSec;
		this.group = group;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public Integer getAgeMonths() {
		return ageMonths;
	}
	public void setAgeMonths(Integer ageMonths) {
		this.ageMonths = ageMonths;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getHeightInches() {
		return heightInches;
	}
	public void setHeightInches(Double heightInches) {
		this.heightInches = heightInches;
	}
	public Double getWeightLbs() {
		return weightLbs;
	}
	public void setWeightLbs(Double weightLbs) {
		this.weightLbs = weightLbs;
	}
	public Double getLegLengthInches() {
		return legLengthInches;
	}
	public void setLegLengthInches(Double legLengthInches) {
		this.legLengthInches = legLengthInches;
	}
	public Double getSpeedMetersPerSec() {
		return speedMetersPerSec;
	}
	public void setSpeedMetersPerSec(Double speedMetersPerSec) {
		this.speedMetersPerSec = speedMetersPerSec;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "DataEntity [id=" + id + ", subjectId=" + subjectId + ", ageMonths=" + ageMonths + ", gender=" + gender
				+ ", heightInches=" + heightInches + ", weightLbs=" + weightLbs + ", legLengthInches=" + legLengthInches
				+ ", speedMetersPerSec=" + speedMetersPerSec + ", group=" + group + "]";
	}
}
