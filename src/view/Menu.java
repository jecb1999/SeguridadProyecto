package view;

import control.MenuControl;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 * Clase que muestra la vista del men� principal de la aplicaci�n.
 *
 */
public class Menu extends Stage {

	private Scene scene;
	private Button cifrar;
	private Button descifrar;
	private Label titulo;
	private MenuControl control;

	/**
	 * Crea una nueva instancia de Menu.
	 */
	public Menu() {
		titulo = new Label("Seguridad Total");
		titulo.setLayoutX(179);
		titulo.setLayoutY(14);
		titulo.setPrefHeight(30);
		titulo.setPrefWidth(180);
		titulo.setTextAlignment(TextAlignment.CENTER);
		titulo.setFont(new Font(25));
		cifrar = new Button("CIFRAR");
		cifrar.setLayoutX(124);
		cifrar.setLayoutY(63);
		descifrar = new Button("DESCIFRAR");
		descifrar.setLayoutX(359);
		descifrar.setLayoutY(63);
		AnchorPane ap = new AnchorPane();
		ap.setPrefHeight(105);
		ap.setPrefWidth(537);
		ap.getChildren().add(cifrar);
		ap.getChildren().add(descifrar);
		ap.getChildren().add(titulo);

		scene = new Scene(ap);
		this.setScene(scene);
		control = new MenuControl(this);
	}

	/**
	 * Retorna el bot�n para cifrar.
	 * 
	 * @return Bot�n para cifrar.
	 */
	public Button getCifrar() {
		return cifrar;
	}

	/**
	 * Cambia el bot�n para cifrar.
	 * 
	 * @param cifrar Nuevo bot�n para cifrar.
	 */
	public void setCifrar(Button cifrar) {
		this.cifrar = cifrar;
	}

	/**
	 * Retorna el bot�n para descifrar.
	 * 
	 * @return Bot�n para descifrar.
	 */
	public Button getDescifrar() {
		return descifrar;
	}

	/**
	 * Cambia el bot�n para descifrar.
	 * 
	 * @param descifrar Nuevo bot�n para descifrar.
	 */
	public void setDescifrar(Button descifrar) {
		this.descifrar = descifrar;
	}

	/**
	 * Retorna el men� de control para cambiar a las vistas de cifrar y descifrar.
	 * 
	 * @return Men� de control.
	 */
	public MenuControl getControl() {
		return control;
	}

	/**
	 * Camia el men� de control.
	 * 
	 * @param control Nuevo men� de control.
	 */
	public void setControl(MenuControl control) {
		this.control = control;
	}

}
