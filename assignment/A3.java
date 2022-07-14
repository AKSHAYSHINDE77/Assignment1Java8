//WAP to take name of employee, sort all employee name using stream and print only unique name from it.

package com.yash.assignment;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class A3 {

	public static void main(String[] args) {
		Collection <String> employee= Arrays.asList("Prashant", "Amit","Akshay","Vipul","Raj", "Tushar", "Rutvik", "Raj", "Manoj","Akshay" );

		List<String> distinctElements = employee.stream()
		.distinct()
		.collect( Collectors.toList() );
		System.out.println( distinctElements );

	}
}
