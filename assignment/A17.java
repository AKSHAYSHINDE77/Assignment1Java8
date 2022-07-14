/*User will enter employee detail like emp name, date of birth , date of joining, date of resign, work location, department, salary. Now we will check following details.
a. Employee in a particular department.
b. Average salary of each department.
c. Highest and lowest salary of each department. 
d. Department with highest no of employee and lowest no of employee. 
e. Total number of years of experience of each employee. 
f. Upcoming birthday and job anniversary in current month from current date to last 
date of month.*/

package com.yash.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A17 {

	public static void main(String args[])
	{
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1,"Prashant","25-12-1997","31-12-2021","31-12-2023","Pune","Java",3,70,000));
		emp.add(new Employee(2,"Amit","10-05-1997","12-03-2020","01-09-2023","Mumbai","Dot Net",4,00,000));
		emp.add(new Employee(3,"Vipul","19-12-1999","31-12-2021","11-12-2025","Banglore","Sql",5,70,000));
		emp.add(new Employee(4,"Akshay","07-07-1997","25-17-2019","12-10-2020","Indore","Python",3,00,000));
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1.Employee in a particular department\n 2.Average salary of each department.\r\n"
				+ " \n 3.Highest and lowest salary of each department.\n 4.Department with highest no of employee and lowest no of employee \n5.Total number of years of experience of each employee. \n6.Upcoming birthday and job anniversary in current month");
       int ch=sc.nextInt();
       while(true) 
       {
        switch(ch) {
          case 1:
                System.out.println("Enter category name");
                break;
        }
       }
	}
}
