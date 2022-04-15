package com.zyapguy.userservice;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Entity @NoArgsConstructor @AllArgsConstructor
@Table(name="users")
public class User {
	@Id
	@SequenceGenerator(name = "user_sequence",sequenceName = "user_sequence",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "user_sequence")
	@Column(name = "id",updatable = false)
	private Long id;
	@Column(name = "name",nullable = false,columnDefinition = "TEXT")
	private String name;
	@Column(name = "username",nullable = false,columnDefinition = "TEXT")
	private String username;
	@Column(name = "password",nullable = false,columnDefinition = "TEXT")
	private String password;
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<Role> roles = new ArrayList<>();
}
