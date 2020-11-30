package main;

import javafx.application.Application;
import view.Menu;
import javafx.stage.Stage;

/**
 * Clase que inicia la aplicación.
 */
public class Launcher extends Application {
	
	public static void main (String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Menu window = new Menu();
		window.show();
		
	}

}
