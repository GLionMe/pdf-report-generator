package com.gaurav.pdfreportgenerator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	private Double empSal;
	private String empDept;
}
