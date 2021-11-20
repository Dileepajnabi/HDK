package com.hospital.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.hospital.dao.HospitalDAO;
import com.hospital.modal.Hospital;

@WebServlet("/get_data")
public class HospitalController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json");
		PrintWriter pw = response.getWriter();

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int age  =request.getParameter("age");
		String address = request.getParameter("address");
		int mobile  =request.getParameter("mobile")


		Hospital h = null;

		h = HospitalDAO.getDatafromDB(id);
		h = HospitalDAO.getDatafromDB(name);
		h = HospitalDAO.getDatafromDB(age);
		h = HospitalDAO.getDatafromDB(address);
		h = HospitalDAO.getDatafromDB(mobile);

		String jsonString = new Gson().toJson(h);

		pw.write(jsonString);
		pw.write(jsonint);
		pw.close();
	}
}
