package com.acadgild;

import java.util.TreeSet;

/**
 * 
 * Example to demonstrate TreeSet implementation. Sorting order should by Salary
 * by default. If salaries are same sort by Employee Name. If names are same
 * sort by Employee Designation
 *
 */
public class Session9Assignment4 {

	public static void main(String[] args) {
		// Instantiate TreeSet with Comparator Class
		TreeSet<Employee> EmployeeSet = new TreeSet<Employee>(new EmployeeComparator());

		// Instantiate three employee objects
		Employee emp1 = new Employee("Deepak", "Software Engineer", 30000);
		Employee emp2 = new Employee("Govind", "Business Analyst", 50000);
		Employee emp3 = new Employee("Deepak", "Consultant", 30000);

		// Add the three employee objects to TreeSet
		EmployeeSet.add(emp1);
		EmployeeSet.add(emp2);
		EmployeeSet.add(emp3);

		// Loop through the ArrayList to display the contents of the ArrayList
		System.out.println("Display contents of TreeSet:");
		for (Employee emp : EmployeeSet) {
			System.out.println("\t" + emp.name + " " + emp.designation + " " + emp.salary);
		}
	}
}
