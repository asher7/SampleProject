package com.springMvcHybernate.entity;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "vehicles")
public class Vehicle {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long vehicleNO;
	
	@Column(name = "no_of_tires")
	private int tires;
	
	@NotBlank(message = "field cannot be empty")
	private String driverName;

	
	@JoinColumn(name = "years")
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private ModelYear modelYear;

	public Vehicle(long vehicleNO, int tires, String driverName, ModelYear modelYear) {
		super();
		this.vehicleNO = vehicleNO;
		this.tires = tires;
		this.driverName = driverName;
		this.modelYear = modelYear;
	}

	public Vehicle() {
		super();
	}

	public long getVehicleNO() {
		return vehicleNO;
	}

	public void setVehicleNO(long vehicleNO) {
		this.vehicleNO = vehicleNO;
	}

	public int getTires() {
		return tires;
	}

	public void setTires(int tires) {
		this.tires = tires;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public ModelYear getModelYear() {
		return modelYear;
	}

	public void setModelYear(ModelYear modelYear) {
		this.modelYear = modelYear;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleNO=" + vehicleNO + ", tires=" + tires + ", driverName=" + driverName + ", modelYear="
				+ modelYear + "]";
	}
	
	

}
