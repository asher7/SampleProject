package com.springMvcHybernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manufacturing")
public class ModelYear {
	
	@Id
	@Column(name = "years")
	private int years;
	@Column(name = "brandValue")
	private String brandValue;
	
	public ModelYear(int years, String brandValue) {
		super();
		this.years = years;
		this.brandValue = brandValue;
	}
	public ModelYear() {
		super();
	}
	
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public String getBrandValue() {
		return brandValue;
	}
	public void setBrandValue(String brandValue) {
		this.brandValue = brandValue;
	}
	
	
	



}
