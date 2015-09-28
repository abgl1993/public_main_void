package mainpack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Polymorphism {

	HR mainappObjectRef=new HR();
	  Employee actual;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testHR() {
		
	  

	
	  actual=mainappObjectRef.recruit("I");
	  assertTrue(actual instanceof Intern);
	  actual=mainappObjectRef.recruit("C");
	  assertTrue(actual instanceof ConfirmedEmployee);
	  actual=mainappObjectRef.recruit("T");
	  assertTrue(actual instanceof Contract);
	  
	  //assertEquals(null, actual);
	}
	@Test
	public final void testForNull(){
		actual=mainappObjectRef.recruit(null);

	}
    

}
