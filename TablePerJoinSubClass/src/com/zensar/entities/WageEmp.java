package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Avani Kala
 * @creation_date 27 sept 2019 11:49 AM
 * @modification_date 27 sep 2019 11:49 AM
 * @version 1.0
 * @copyright Zensar Technologies. All rights reserved.
 * @description Persistence class
 *
 */

@Entity
@Table(name = "wage_emp_two")
public class WageEmp extends Employee {
	private int hours;
	private float rate;
	
	public WageEmp() {
		// TODO Auto-generated constructor stub
	}

	public WageEmp(int empId, String name, LocalDate joinDate, double salary, int hours, float rate) {
		super(empId, name, joinDate, salary);
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
	}

	
	
}
