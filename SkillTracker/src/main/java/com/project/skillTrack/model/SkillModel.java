package com.project.skillTrack.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="skills")
public class SkillModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Column(name="SKILLS")
	private String skillName;
	
	@Column(name="TARGET_HOUR")
	private Integer targetHours = 0;
	
	@Column(name="COMPLETED_HOURS")
	private Integer completedHours = 0; 
	
	@Column(name="NOTES", columnDefinition = "TEXT")
	private String notes;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	private UserModel user;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public Integer getTargetHours() {
		return targetHours;
	}
	public void setTargetHours(Integer targetHours) {
		this.targetHours = targetHours;
	}
	public Integer getCompletedHours() {
		return completedHours;
	}
	public void setCompletedHours(Integer completedHours) {
		this.completedHours = completedHours;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	
	
}
