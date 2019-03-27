package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import main.Date;
import org.junit.Before;

public class DateTest
    {
      Date d1;
      Date d3;
      
      @Before
      public void setup()
      {
          d1 = new Date(20,10,2017);
          d3 = new Date(03,11,2015);
      }
      
      @Test
      public void checkWiththeSmaller()
      {
         assertTrue(d1.isSmaller(d3));
      }
      
      @Test
      public void checkWiththeBig()
      {
        assertFalse(d3.isSmaller(d1));
      }

      @Test
      public void testDayDiff()
      {
         assertEquals(66,new Date(2017,05,24).daydiff(new Date(2017,07,29)));
      }
}