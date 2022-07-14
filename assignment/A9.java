//WAP to implement predicate to check given list of array contain how many even and odd nos.

package com.yash.assignment;

import java.util.Arrays;
import java.util.List;

public class A9 {

	public static void main(String[] args) 
	{
		int array[] = {34, 45, 66, 27, 89, 44, 28, 48};
		int n = array.length;

		int evenSize = 0;
		int oddSize = 0;
		for (int i = 0; i < n; i++) {
		if (array[i] % 2 == 0)
		evenSize++;
		else
		oddSize++;
		}
		System.out.print("Even numbers in Array : "+evenSize+"\n");
		System.out.print("Odd numbers in Array : "+oddSize);
	}

}
