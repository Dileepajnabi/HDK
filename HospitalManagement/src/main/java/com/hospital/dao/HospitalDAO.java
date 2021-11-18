package com.hospital.dao;

import com.hospital.modal.Hospital;

public class HospitalDAO {

	public static Hospital getDatafromDB(String id) {
		// logic

		Hospital h = new Hospital();
		h.setCode(id);
		h.setName("My Name is " + id);

		return h;
	}

}
