//wap to perform parrallel stream api to find the no.

package com.yash.assignment;

import java.util.ArrayList;
import java.util.List;

public class A11 {

	public static void main(String[] args) 
	{
		List<Integer> num = new ArrayList<Integer>();
		num.add(17);
		num.add(4);
		num.add(96);
		num.add(56);
		num.add(13);
		num.add(35);



		System.out.println("find any number in parallel stream:");
		num.stream().parallel().filter(n -> n > 60).findAny().ifPresent(System.out::println);
	}

}
