package com.zyapguy.userservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="roles")
public class Role {

	@Id
	@SequenceGenerator(name = "role_sequence",sequenceName = "role_sequence",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "role_sequence")
	@Column(name = "id",updatable = false)
	private Long id;
	@Column(name = "name",nullable = false,columnDefinition = "TEXT")
	private String name;
}
