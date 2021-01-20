package com.javalabs.employeemanager.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Entity
public class Employee {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

	private String name;
	private String surname;
	private Date dob;
	private String city;
	private String state;
	private String country;
	@Column(name = "us_citizen")
	private Boolean usCitizen;
	private String phone;
	private String email;
	@Column(name = "preferred_contact")
	private String preferredContact;
	private String occupation;
	private String website;
	private String instagram;
	@Column(name = "photo_1")
	private String photo1;
	@Column(name = "photo_2")
	private String photo2;
	@Column(name = "photo_3")
	private String photo3;
	@Column(name = "photo_4")
	private String photo4;
	@Column(name = "photo_5")
	private String photo5;
	@Column(name = "photo_6")
	private String photo6;
	@Column(name = "photo_7")
	private String photo7;
	@Column(name = "photo_8")
	private String photo8;
	@Column(name = "photo_9")
	private String photo9;
	@Column(name = "photo_10")
	private String photo10;
	@Column(name = "government_issued_id_type")
	private String governmentIssuedIdType;
	@Column(name = "front_of_photo_id")
	private String frontOfPhotoId;
	@Column(name = "digital_signature")
	private String digitalSignature;
	@Column(name = "digital_signature_date")
	private Date digitalSignatureDate;
}
