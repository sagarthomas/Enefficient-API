import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import model.adt.WasherADT;
import model.util.Dataset;

public class TestDataset {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("HI");
	}
	
	@Test
	public void testInit() {
		assert Dataset.init();
	}
	
	@Test
	public void testGetWashers() {
		ArrayList<WasherADT> a = Dataset.getWashers();
		for (WasherADT w : a) {
			System.out.println(w.getBRAND_NAME() + " " + w.getMMODEL_NUM_1());
		}
	}

}
