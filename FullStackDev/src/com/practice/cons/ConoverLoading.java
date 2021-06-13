package com.practice.cons;

public class ConoverLoading {

	public static void main(String[] args) {
		Employee emp = new Employee(13, "Manikn");
		System.out.println(emp.getId());
		System.out.println(emp.getEmpName());

		Employee emp1 = new Employee(13, "Kalai", "Chennai");
		System.out.println(emp1.getId());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpAdd());

	}

}
