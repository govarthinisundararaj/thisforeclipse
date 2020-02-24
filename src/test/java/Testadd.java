package test.java;


import org.junit.Test;

import junit.framework.Assert;
import main.java.Add;


public class Testadd {

	@Test
	
		public void Adder_fun()
		{
		   Add a=new Add();
			Assert.assertEquals(11, a.Adder_fun(5,5,1));
		
			
		}
}