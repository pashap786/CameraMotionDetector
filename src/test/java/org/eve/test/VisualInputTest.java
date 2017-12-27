package org.eve.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eve.services.VisualInputService;
import org.junit.Test;

public class VisualInputTest {
	
	@Test
	public void testVisualInput() {
		VisualInputService vis = new VisualInputService();
		boolean failed = false; 
		try {
			vis.capture();
		} catch (IOException e) {
			failed= true;
		}
		assertTrue(failed != true);
	}

}
