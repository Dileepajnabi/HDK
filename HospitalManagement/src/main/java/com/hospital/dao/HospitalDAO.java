package com.hospital.dao;

import com.hospital.modal.Hospital;

public class HospitalDAO {

	public static Hospital getDatafromDB(String id,String name) {
		// logic

		Hospital h = new Hospital();
		h.setCode("My id is=" +id);
		h.setName("My name is= " + name);
		h.setAge("Age is= "+ age);
		h.setAddress("Address= "+ address);
		h.setMobNum("Mobile no= "+ mobile);
	

		return h;
	}

}
