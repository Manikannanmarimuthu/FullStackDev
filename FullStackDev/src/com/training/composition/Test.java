package com.training.composition;

public class Test {

	public static void main(String[] args) {
		
		Project project = new Project();
		project.setId(100);
		project.setProjectName("Citi");

		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Manikannan");
		employee1.setProject(project);
		
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Kalai");
		employee2.setProject(project);

		System.out.println(employee1);
		System.out.println(employee2);
		
	}
}
