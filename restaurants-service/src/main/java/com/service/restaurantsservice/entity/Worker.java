package com.service.restaurantsservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Data
@Entity
@Table(name="worker")
public class Worker {
@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long workerId;
private String firstName;
private String lastName;
private long mobileNo;
private long aadharCardNo;
private String address;
public long getWorkerId() {
	return workerId;
}
public void setWorkerId(long workerId) {
	this.workerId = workerId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
public long getAadharCardNo() {
	return aadharCardNo;
}
public void setAadharCardNo(long aadharCardNo) {
	this.aadharCardNo = aadharCardNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}
