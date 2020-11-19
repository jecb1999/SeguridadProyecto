package control;

import javafx.application.Platform;
import view.Cifrar;
import view.Descifrar;
import view.Menu;

public class MenuControl {
	
	private Menu view;
	
	public MenuControl(Menu view) {
		this.view = view;
		init();
	}

	public void init() {
		view.getCifrar().setOnAction((e) -> {
			Platform.runLater(() -> {
				Cifrar window = new Cifrar();
				window.show();
				view.close();
				
			});
		});
		
		view.getDescifrar().setOnAction((e) -> {
			Platform.runLater(()->{
				Descifrar window = new Descifrar();
				window.show();
				view.close();
			});
		});
		
	}

}
