package com.sm.demo.sm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class SM {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long seq;
	
	@Column(unique=true)
	private String id;
	private String name;
	private String echelon;
	private String birth;
	private String phone;
	private String eduLevel;
	private String country;
	private boolean license;
	
	public Long getSeq() {
		return seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEchelon() {
		return echelon;
	}
	public void setEchelon(String echelon) {
		this.echelon = echelon;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEduLevel() {
		return eduLevel;
	}
	public void setEduLevel(String eduLevel) {
		this.eduLevel = eduLevel;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isLicense() {
		return license;
	}
	public void setLicense(boolean license) {
		this.license = license;
	}
	@Override
	public String toString() {
		return "SM [seq=" + seq + ", id=" + id + ", name=" + name + ", echelon=" + echelon + ", birth=" + birth
				+ ", phone=" + phone + ", eduLevel=" + eduLevel + ", country=" + country + ", license=" + license + "]";
	}
	
	
	
}
