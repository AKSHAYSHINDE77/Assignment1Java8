//WAP to create 10 objects of employee class, add all object to arraylist and from arraylist we need to convert this to map and set using stream api

package com.yash.assignment;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class A10 {

	String name;
	int id;
	public A10(String name, int id) {

	this.name = name;
	this.id = id;



	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public static void main(String[] args) {
	ArrayList<A10> I=new ArrayList<A10>();
	I.add(new A10("prashant",1));
	I.add(new A10("vipul",2));
	I.add(new A10("amit",3));



	Map<Integer,String> empMap=I.stream().collect(Collectors.toMap(e->e.getId(),e->e.getName()));
	System.out.println(empMap);



	Set<String> nameSet = I.stream().map(e->e.name).collect(Collectors.toSet());



	System.out.println(nameSet);
	}
}
