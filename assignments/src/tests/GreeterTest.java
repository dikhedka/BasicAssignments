package tests;
 
import static org.junit.Assert.*;
import org.junit.Test;
import main.*;


public class GreeterTest
{
	
    @Test
    public void TestGreet(){
    assertEquals("hello",new Greeter().greet());
}
}