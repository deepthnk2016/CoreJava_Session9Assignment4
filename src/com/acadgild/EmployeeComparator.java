package com.acadgild;

import java.util.Comparator;

/**
 * 
 * Class to implement Comparator and to override the compare method to compare
 * salary, name and designation of employees
 *
 */
public class EmployeeComparator implements Comparator<Object> {

	public int compare(Object arg0, Object arg1) {

		Employee emp1 = (Employee) arg0;
		Employee emp2 = (Employee) arg1;
		
		if (emp1.salary == emp2.salary)
			if (emp1.name == emp2.name)
				return emp1.designation.compareTo(emp2.designation);
			else
				return emp1.name.compareTo(emp2.name);
		else if (emp1.salary > emp2.salary)
			return 1;
		else
			return -1;
	}

}
