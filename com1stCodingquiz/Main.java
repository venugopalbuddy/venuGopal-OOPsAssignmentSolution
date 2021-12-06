package com1stCodingquiz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HrDepartment h =new HrDepartment();
		TechDepartment t =new TechDepartment();
		AdminDepartment a =new AdminDepartment();
		
		System.out.println("Welcome to "+a.departmentName());
		System.out.println(a.getTodaysWork());
		System.out.println(a.getWorkDeadline());
		System.out.println(a.isTodayAHoliday());
		System.out.println("                  ");
		System.out.println("Welcome to "+h.departmentName());
		System.out.println(h.doActivity());
		System.out.println(h.getTodaysWork());
		System.out.println(h.getWorkDeadline());
		System.out.println(h.isTodayAHoliday());
		System.out.println("                  ");
		System.out.println("Welcome to "+t.departmentName());
		System.out.println(t.getTodaysWork());
		System.out.println(t.getWorkDeadline());
		System.out.println(t.getTechStackInformation());
		System.out.println(t.isTodayAHoliday());
	}

}
