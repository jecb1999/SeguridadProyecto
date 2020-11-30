package control;

import javafx.application.Platform;
import view.Cifrar;
import view.Descifrar;
import view.Menu;

/**
 * Clase que realiza las acciones de la interfáz del Menú principal.
 */
public class MenuControl {

	private Menu view;

	/**
	 * Crea una nueva instancia de MenuControl.
	 * 
	 * @param view Vista del Menú principal.
	 */
	public MenuControl(Menu view) {
		this.view = view;
		init();
	}

	/**
	 * Inicializa las acciones para cambiar a las ventanas de Cifrar y Descifrar.
	 */
	public void init() {
		view.getCifrar().setOnAction((e) -> {
			Platform.runLater(() -> {
				Cifrar window = new Cifrar();
				window.show();
				view.close();

			});
		});

		view.getDescifrar().setOnAction((e) -> {
			Platform.runLater(() -> {
				Descifrar window = new Descifrar();
				window.show();
				view.close();
			});
		});

	}

}
