package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.Cellphone;


public class CellphoneTest {

	private static Cellphone nokia;
	private static Cellphone apple;
	private static Cellphone samsung;
	private static Cellphone mi;
	
	
	@BeforeClass
	public static void setup() {
		nokia = new Cellphone("Nokia","Z7","abc","windows",4000);
		apple = new Cellphone("Apple","X10","nice","ios",100000);
		samsung = new Cellphone("Samsung","Z9","xyz","anroid",2000);
		mi = new Cellphone("MI","A8","good","anroid",6000);
	}
	
	@Test
	public void testPhoneIsBeingInserted()
	{
		ArrayList<Cellphone> ar = new ArrayList<>();
		ar.add(nokia);
		ar.add(apple);
		ar.add(samsung);
		ar.add(mi);
		Iterator <Cellphone> it = ar.iterator();
		assertEquals(nokia,it.next());
		assertEquals(apple,it.next());
		assertEquals(samsung,it.next());
		assertEquals(mi,it.next());
		
	}

	
	@Test
	public void testPhoneHasDuplicate()
	{
		HashSet<Cellphone> hs = new HashSet();
		hs.add(nokia);
		hs.add(apple);
		hs.add(samsung);
		hs.add(mi);
		hs.add(mi);
		assertEquals(4,hs.size());
		
	}
}
