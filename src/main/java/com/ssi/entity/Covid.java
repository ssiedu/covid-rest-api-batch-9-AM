package com.ssi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="covidinfo")
@Data
public class Covid {
	@Id
	private int sno;
	private String state;
	private int total;
	private int active;
	private int deaths;
	private int year;
}
