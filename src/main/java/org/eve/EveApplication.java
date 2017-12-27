package org.eve;

import java.awt.Button;
import java.awt.Label;
import java.io.IOException;

import org.eve.core.CoreActions;
import org.eve.services.MotionDetector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@SpringBootApplication
public class EveApplication {

	private static Logger log = LoggerFactory.getLogger(EveApplication.class);
	
	Button motionDetection = new Button();
	Label title = new Label("iSee");
	CoreActions ca = new CoreActions();
	
	public static void main(String[] args) {
		
		
	}
	
	

//	public static void main(String[] args) throws Exception {
//
//		SpringApplication springApplication = new SpringApplication(EveApplication.class);
//		springApplication.setBannerMode(Banner.Mode.OFF);
//
//		springApplication.run(args);
//
//	}

}
