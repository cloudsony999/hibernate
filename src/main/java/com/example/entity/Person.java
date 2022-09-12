package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "amitavatable")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

	@Id
	@Column(name = "amitavaid")
	private int id;
	@Column(name = "amitavaname", length = 20)
	private String name;
	@Column(name = "amitavaemail", length = 22)
	private String email;

}
