package org.eve.core;

import java.io.IOException;

import org.eve.services.MotionDetector;

public class CoreActions {
	
	MotionDetector md = new MotionDetector();
	
	public void stopMotionDetection() {
		md.stopDetection();
	}
	
	public void startMotionDetection() {
			md.startDetection();

		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
