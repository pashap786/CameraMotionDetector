package org.eve.services;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.eve.util.Utility;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamDevice;

public class VisualInputService {

	public VisualInputService() {
		Utility.createFolders();
	}

	public void testWebCam() throws IOException {
		Webcam webcam = Webcam.getDefault();
		webcam.open();
		WebcamDevice wd = webcam.getDevice();
		System.out.println(wd.getName());
		ImageIO.write(webcam.getImage(), "PNG",
				new File(Utility.todaysPath() + Utility.imageName() + ".png"));
	}

	public void capture() throws IOException {
		Webcam webcam = Webcam.getDefault();
		webcam.open();
		ImageIO.write(webcam.getImage(), "PNG",
				new File(Utility.todaysPath()  + Utility.imageName() + ".png"));
	}

}
