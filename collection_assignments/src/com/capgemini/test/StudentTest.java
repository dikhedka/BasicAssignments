package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.Student;

public class StudentTest {

	private static Student Divya;
	private static Student Deepti;
	private static Student Kapil;
	private static Student Tanmay;
	
	@BeforeClass
	public static void setup() {
		Divya = new Student(1, "Divya");
		Deepti = new Student(2, "Deepti");
		Kapil = new Student(3, "Kapil");
		Tanmay = new Student(4, "Tanmay");
	}
	
	@Test
	public void testStudentIsBeingInserted() {
		ArrayList<Student> arr = new ArrayList();
		arr.add(Divya);
		arr.add(Deepti);
		arr.add(Kapil);
		arr.add(Tanmay);
		Iterator <Student> it = arr.iterator();
		assertEquals(Divya,it.next());
		assertEquals(Deepti,it.next());
		assertEquals(Kapil,it.next());
		assertEquals(Tanmay,it.next());
	}
	
	@Test
	public void testStudentHasDuplicate() {
		HashSet<Student> hs = new HashSet();
		hs.add(Deepti);
		hs.add(Divya);
		hs.add(Kapil);
		hs.add(Tanmay);
		hs.add(Deepti);
		assertEquals(4,hs.size());
	}
	
	@Test
	public void testCarIsAscendingOrder()
	{
		TreeSet<Student> ts = new TreeSet();
		ts.add(Deepti);
		ts.add(Divya);
		ts.add(Kapil);
		ts.add(Tanmay);
		Iterator <Student> it = ts.iterator();
		assertEquals(Divya,it.next());
		assertEquals(Deepti,it.next());
		assertEquals(Kapil,it.next());
		assertEquals(Tanmay,it.next());
	}
	
	@Test
	public void testStudentMappingByGetFriutsByTheirNames() {
		HashMap<String ,String> students = new HashMap<String , String>();
		students.put("Divya", "Mango");
		students.put("Deepti", "Banana");
		students.put("Kapil", "Papaya");
		students.put("Tanmay", "Grapes");
		
		assertEquals("Mango",students.get("Divya"));
		assertEquals("Banana",students.get("Deepti"));
		assertEquals("Papaya",students.get("Kapil"));
		assertEquals("Grapes",students.get("Tanmay"));
	}
	
	

	

}
