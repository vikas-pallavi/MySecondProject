package com.example.demo.dto;

public class StudentDto {

	protected int studId;
	protected String studName;
	protected String city;
	protected String country;
	protected String mobileNo;

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", city=" + city + ", country=" + country
				+ ", mobileNo=" + mobileNo + "]";
	}

}
