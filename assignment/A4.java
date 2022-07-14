//WAP to find maximum from array of numbers with the help of stream api.

package com.yash.assignment;

import java.util.*;

public class A4 {

	public static void main(String[] args) 
	{
		List<Integer> max= Arrays.asList(20,40,60,10,50,30);
		
		Comparator<Integer> maxComparator= new Comparator<Integer>()
		{
			@Override
			public int compare(Integer a1, Integer a2) {
				return a1.compareTo(a2);
			}
		};
		Optional<Integer> maxNumber= max.stream().max(maxComparator);
		System.out.println(maxNumber.get());
	}

}
