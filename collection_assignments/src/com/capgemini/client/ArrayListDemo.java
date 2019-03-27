package com.capgemini.client;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		 ArrayList<String> names = new ArrayList<>();
		  names.add(101,"Alex");
		  names.add(102,"Adam");
		  names.add(103,"Bob");
		  names.add(104,"Divya");
		  names.add(102,"Adam");
		  names.add(105,"Pooja");
		  names.add(106,"Pratiksha");
		 
		/*  Iterator<String> it = names.iterator();
		  while(it.hasNext()) {
			  String name = it.next();
			  System.out.println(name);
		  }
		*/ 
	
	 for(String name : names) {
		 System.out.println(name);
	 }

	}}
