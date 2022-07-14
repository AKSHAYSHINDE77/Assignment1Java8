//WAP to create list of item price whose price is less than avg price of all item.

package com.yash.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A6 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(37);
		a.add(68);
		a.add(83);
		a.add(95);
		a.add(69);

		Double avgmark = a.stream().mapToDouble(s -> s.intValue()).average().getAsDouble();
		System.out.println("Average of marks : " +avgmark);

		List<Integer> l=a.stream().filter(i -> i<avgmark).collect(Collectors.toList());

		System.out.println("List of numbers less than average : " +l);
	}

}
