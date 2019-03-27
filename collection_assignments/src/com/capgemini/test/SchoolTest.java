package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;


import com.capgemini.client.School;

public class SchoolTest {

	private static School HFCS;
	private static School DelhiPublic;
	private static School Army;
	private static School Centre;
	
	@BeforeClass
	public static void setup() {
		HFCS = new School("hfcs","Bhopal","huzur", 7);
		DelhiPublic = new School("delhipublic","Delhi","new delhi",8);
		Army = new School("army","Chennai","abc",9);
		Centre = new School("centre","Mumbai","vashi",8);
		
	}
	
	@Test
	public void testSchoolIsBeingInserted() {
		ArrayList<School> arr = new ArrayList<>();
		arr.add(HFCS);
		arr.add(DelhiPublic);
		arr.add(Army);
		arr.add(Centre);
		Iterator <School> it = arr.iterator();
		assertEquals(HFCS,it.next());
		assertEquals(DelhiPublic,it.next());
		assertEquals(Army,it.next());
		assertEquals(Centre,it.next());
		
	}
	
	
	@Test
	public void testForSchoolIsDuplicate() {
		
	HashSet<School> hs = new HashSet();
	hs.add(HFCS);
	hs.add(DelhiPublic);
	hs.add(Army);
	hs.add(Centre);
	hs.add(Centre);
	assertEquals(4,hs.size());
	
	}

	
}
