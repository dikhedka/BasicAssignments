package tests;

import org.junit.Test;
import org.junit.Before;
import main.Country;
import static org.junit.Assert.*;
  
  public class CountryTest
   {
     Country[] country = new Country[3];
 	@Before   
	 public void Setup()
       {
           country[0] = new Country("India",12348,447486);
           country[1] = new Country("USA",48578,458795);
           country[2] = new Country("UK",458791,454145);
       }
    
       @Test
       public void testwithlargestArea()
        {
            	Country c1 = new Country("India",12348,447486);
   		Country c2 = new Country();
		assertEquals(c1.getCountryarea(),c2.tofindCountryWithlargestarea(country).getCountryarea());
        }
       
        @Test
        public void testwithlargestpopulation()
        {
            	Country c1 = new Country("India",12348,447486);
   		Country c2 = new Country();
		assertEquals(c1.getCountrypopulation(),c2.tofindCountryWithlargestpopulation(country).getCountrypopulation());
        }

        @Test
        public void testwithlargestpopulationdensity()
        {
            	Country c1 = new Country("India",12348,447486);
   		Country c2 = new Country();
		assertEquals(c1.getCountryarea(),c2.tofindCountryWithlargestpopulationdensity(country).getCountryarea());
        }
        }