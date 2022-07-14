// WAP to find the maximum length of given string without using any length function use 
//stream api. 

package com.yash.assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A5 {

	public static void main(String[] args) 
	{
		List<String> employee = Arrays.asList("vipul", "amit", "prashant", "raj");
		Comparator<String> compByLength = (aName, bName) -> aName.length() - bName.length();
		employee.stream()
		.max(compByLength)
		.ifPresent(
		longest -> System.out.println("\nThe longest name is :" + longest));
	}

}
