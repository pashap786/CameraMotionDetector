package org.eve.services;

import java.io.IOException;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamMotionDetector;
import com.github.sarxos.webcam.WebcamMotionEvent;
import com.github.sarxos.webcam.WebcamMotionListener;

public class MotionDetector implements WebcamMotionListener {
	
	int count = 0;
	
	VisualInputService vis = new VisualInputService();

	WebcamMotionDetector detector = null;
	
	public MotionDetector() {
		detector = new WebcamMotionDetector(Webcam.getDefault());
		detector.setInterval(500); // one check per 500 ms
		detector.addMotionListener(this);		
	}
	
	public void startDetection() {
		detector.start();
	}

	public void stopDetection() {
		detector.stop();
	}
	
	@Override
	public void motionDetected(WebcamMotionEvent wme) {
		System.out.println("motion detected");
		try {
			vis.capture();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

