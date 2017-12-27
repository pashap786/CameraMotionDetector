package org.eve.test;


import org.junit.Test;

import java.io.IOException;

import org.eve.services.MotionDetector;

public class MotionDetectorTest {
	
	
	@Test
	public void testMotion() {
		System.out.println("Detecting motion");
		MotionDetector md = new MotionDetector();
		try {
			md.startDetection();
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
