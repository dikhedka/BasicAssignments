package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.Car;


public class CarTest {

	private static Car tata;
	private static Car  maruti;
	private static Car bmw;
	private static Car audi;
	
	
     @BeforeClass
	public static void setup() {
		tata = new Car("India", "ta12", 2003, 100000);
		maruti = new Car("Germany", "ma34", 2002, 200000);
		bmw = new Car("France", "bm45", 2001, 300000);
		audi = new Car("USA", "au56", 2004, 400000);
	}
	
	 @Test
	 public void testLaptopIsBeingInserted()
	 {
		 ArrayList<Car> arr = new ArrayList<>();
		arr.add(tata);
		arr.add(maruti);
		arr.add(bmw);
		arr.add(audi);
		Iterator <Car> it = arr.iterator();
	    assertEquals(tata, it.next());
	    assertEquals(maruti, it.next());
	    assertEquals(bmw, it.next());
	    assertEquals(audi, it.next());
		
		                                                                                                                         
		
	 }
	 
	 @Test
	 public void testLaptopIsNotHavingDuplicate()
	 {
		 HashSet<Car> hs = new HashSet();
		 hs.add(tata);
		 hs.add(maruti);
		 hs.add(bmw);
		 hs.add(audi);
		 hs.add(audi);
		 assertEquals(4,hs.size());
	 }
	
	@Test
	public void testCarIsAscendingOrder()
	{
		TreeSet<Car> ts = new TreeSet();
		ts.add(tata);
		ts.add(maruti);
		ts.add(audi);
		ts.add(bmw);
		Iterator <Car> it = ts.iterator();
		assertEquals(bmw,it.next());
		assertEquals(maruti,it.next());
		assertEquals(tata,it.next());
		assertEquals(audi,it.next());
		
		
		
		
		
	}
}
