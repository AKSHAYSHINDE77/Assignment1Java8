//WAP to print only those price which are even from the given item list.

package com.yash.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A7 {

	public static void main(String args[])
	{
		List<Integer> l1= Arrays.asList(57, 68, 35, 55, 28, 84);
		List<Integer> eNumbers= l1.stream().filter(a-> a%2==0).collect(Collectors.toList());

		System.out.println(eNumbers);
	}
}
