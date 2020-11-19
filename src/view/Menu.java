package view;

import control.MenuControl;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Menu extends Stage {
	
	private Scene scene;
	private Button cifrar;
	private Button descifrar;
	private Button comparar;
	private Label titulo;
	private MenuControl control;
	
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
		descifrar.setLayoutX(231);
		descifrar.setLayoutY(63);
		comparar = new Button("COMPARAR");
		comparar.setLayoutX(359);
		comparar.setLayoutY(63);
		AnchorPane ap = new AnchorPane();
		ap.setPrefHeight(105);
		ap.setPrefWidth(537);
		ap.getChildren().add(cifrar);
		ap.getChildren().add(descifrar);
		ap.getChildren().add(comparar);
		ap.getChildren().add(titulo);
		
		scene = new Scene(ap);
		this.setScene(scene);
		control = new MenuControl(this);
	}

	public Button getCifrar() {
		return cifrar;
	}

	public void setCifrar(Button cifrar) {
		this.cifrar = cifrar;
	}

	public Button getDescifrar() {
		return descifrar;
	}

	public void setDescifrar(Button descifrar) {
		this.descifrar = descifrar;
	}

	public Button getComparar() {
		return comparar;
	}

	public void setComparar(Button comparar) {
		this.comparar = comparar;
	}

	public MenuControl getControl() {
		return control;
	}

	public void setControl(MenuControl control) {
		this.control = control;
	}
	
	

}
