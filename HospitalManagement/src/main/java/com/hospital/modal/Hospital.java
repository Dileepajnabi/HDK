package com.hospital.modal;

public class Hospital {

//set and get data one by one

	private String name;

	private String code;

	private  int age;

	private String address;

	private int mobile;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public int getMobNum(){
		return mobile;
	}
	public void setMobNum(int mobile){
		this.mobile = mobile;
	}
}
