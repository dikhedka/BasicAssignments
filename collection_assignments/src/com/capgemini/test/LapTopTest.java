package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.LapTop;

public class LapTopTest {

	private static LapTop dellLaptop;
	private static LapTop appleLaptop;
	private static LapTop hpLaptop;
	private static LapTop accerLaptop;
	
	
     @BeforeClass
	public static void setup() {
		dellLaptop = new LapTop("dell", "ab2", "windows10", "i5");
		appleLaptop = new LapTop("apple", "ab9", "ios", "i10");
		hpLaptop = new LapTop("hp", "ab5", "windows11", "i8");
		accerLaptop = new LapTop("accer", "ab3", "windows7", "i6");
	}
	
	 @Test
	 public void testLaptopIsBeingInserted()
	 {
		 ArrayList<LapTop> arr = new ArrayList<>();
		arr.add(dellLaptop);
		arr.add(appleLaptop);
		arr.add(hpLaptop);
		arr.add(accerLaptop);
		Iterator <LapTop> it = arr.iterator();
	    assertEquals(dellLaptop, it.next());
	    assertEquals(appleLaptop, it.next());
	    assertEquals(hpLaptop, it.next());
	    assertEquals(accerLaptop, it.next());
		
		                                                                                                                         
		
	 }
	 
	 @Test
	 public void testLaptopIsNotHavingDuplicate()
	 {
		 HashSet<LapTop> hs = new HashSet();
		 hs.add(dellLaptop);
		 hs.add(appleLaptop);
		 hs.add(hpLaptop);
		 hs.add(accerLaptop);
		 hs.add(accerLaptop);
		 assertEquals(4,hs.size());
	 }
	
	
}
