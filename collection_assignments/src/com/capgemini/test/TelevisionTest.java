package com.capgemini.test;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.Television;

public class TelevisionTest {

	private static Television lg;
	private static Television panasonic;
	private static Television sony;
	private static Television mi;
	
	
	@BeforeClass
	public static void setup() {
		lg = new Television("LG","LCD", false,20000);
		panasonic = new Television("Panasonic","LED",true,30000);
		 sony = new Television("Sony","Plasama",false,10000);
		mi = new Television("MI","LCD",true,40000);
		
		
	}
	
	 @Test
	 public void testCarIsBeingInserted()
	 {
		 ArrayList<Television> arr = new ArrayList<>();
		arr.add(lg);
		arr.add(panasonic);
		arr.add(sony);
		arr.add(mi);
		Iterator <Television> it = arr.iterator();
	    assertEquals(lg, it.next());
	    assertEquals(panasonic, it.next());
	    assertEquals(sony, it.next());
	    assertEquals(mi, it.next());
		
	 }
	 
	 
	 @Test
	 public void testCarIsNotHavingDuplicate()
	 {
		 HashSet<Television> hs = new HashSet<>();
		   hs.add(lg);
		   hs.add(panasonic);
		   hs.add(sony);
		   hs.add(mi);
		   hs.add(mi);
		   assertEquals(4,hs.size());
	 }
}
