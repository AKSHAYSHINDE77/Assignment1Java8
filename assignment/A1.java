//WAP to find out average marks from the list of the marks, user will enter the marks through 
//the input box and you need to fetch them and calculate the marks.

package com.yash.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
	
			Scanner in = new Scanner(System.in);
			int n1 = 0,n2=0,n3=0,n4=0,n5=0;
			
			while(n1 == 0) {
			System.out.print("Input Maths number: ");
			int tempnum1 = in.nextInt();
			if(tempnum1 > 101) {
			System.out.println("please correct number");
			}
			else {
			n1= tempnum1;
			}
			}

			while(n2 == 0) {
			System.out.print("Input English number: ");
			int tempnum2 = in.nextInt();
			if(tempnum2 > 101) {
			System.out.println("please correct number");
			}
			else {
			n2= tempnum2;
			}
			}

			while(n3 == 0) {
			System.out.print("Input Marathi number: ");
			int tempnum3 = in.nextInt();
			if(tempnum3 > 101) {
			System.out.println("please correct number");
			}
			else {
			n3= tempnum3;
			}
			}

			while(n4 == 0) {
			System.out.print("Input science number: ");
			int tempnum4 = in.nextInt();
			if(tempnum4 > 101) {
			System.out.println("please correct number");
			}
			else {
			n4= tempnum4;
			}
			}

			while(n5 == 0) {
			System.out.print("Enter History number: ");
			int tempnum5 = in.nextInt();
			if(tempnum5 > 101) {
			System.out.println("please correct number");
			}
			else {
			n5= tempnum5;
			}
			}

			System.out.println("Average of five numbers is: " +
			(n1 + n2 + n3 + n4 + n5) / 5);


			// By using lambda and stream API
			List<Integer> Marks = Arrays.asList(n1 , n2 , n3 , n4 , n5);
			Double y= Marks.stream().mapToInt(val -> val).average().getAsDouble();
			System.out.println("Average of all marks using lambda expression : " + y);
		}

}
