package org.eve;

import org.eve.core.CoreActions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.*;

//@SpringBootApplication
public class EveApplication extends Application {

	private static Logger log = LoggerFactory.getLogger(EveApplication.class);

	Button motionDetection;
	CoreActions ca = new CoreActions();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Surveilance");
		motionDetection = new Button();
		motionDetection.setText("Start Motion Detection");
		
		StackPane sp = new StackPane();
		
		Scene scene = new Scene(sp, 600, 600);
		
		stage.setScene(scene);
		
		
	}

	// public static void main(String[] args) throws Exception {
	//
	// SpringApplication springApplication = new
	// SpringApplication(EveApplication.class);
	// springApplication.setBannerMode(Banner.Mode.OFF);
	//
	// springApplication.run(args);
	//
	// }

}
