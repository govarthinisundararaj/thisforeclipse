package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.java.Add;


public class Testdiv {
	@Test
	public void div_fun()
	{
		Add a=new Add();
		Assert.assertEquals(1, a.div_10(5,4,2));
		
}
}
