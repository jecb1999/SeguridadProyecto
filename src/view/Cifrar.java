package view;

import control.CifrarControl;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Cifrar extends Stage {
	
	private Label contrasenha;
	private TextField putContra;
	private Button archivoIn;
	private Text rutaIn;
	private Button archivoOut;
	private Text rutaOut;
	private Button cifrar;
	private Scene scene;
	private CifrarControl control;
	
	public Cifrar() {
		contrasenha = new Label("Contrasenha");
		contrasenha.setLayoutX(147);
		contrasenha.setLayoutY(14);
		putContra = new TextField();
		putContra.setLayoutX(273);
		putContra.setLayoutY(10);
		archivoIn = new Button("Archivo Entrada");
		archivoIn.setLayoutX(127);
		archivoIn.setLayoutY(64);
		rutaIn = new Text();
		rutaIn.setLayoutX(273);
		rutaIn.setLayoutY(81);
		rutaIn.setWrappingWidth(149.0000031888485);
		archivoOut = new Button("Archivo Salida");
		archivoOut.setLayoutX(127);
		archivoOut.setLayoutY(115);
		rutaOut = new Text();
		rutaOut.setLayoutX(273);
		rutaOut.setLayoutY(132);
		rutaOut.setWrappingWidth(149.0000031888485);
		cifrar = new Button("CIFRAR");
		cifrar.setLayoutX(221);
		cifrar.setLayoutY(170);
		
		AnchorPane ap = new AnchorPane();
		ap.setPrefHeight(209);
		ap.setPrefWidth(497);
		ap.getChildren().add(contrasenha);
		ap.getChildren().add(putContra);
		ap.getChildren().add(archivoIn);
		ap.getChildren().add(rutaIn);
		ap.getChildren().add(rutaOut);
		ap.getChildren().add(archivoOut);
		ap.getChildren().add(cifrar);
		
		scene = new Scene(ap);
		this.setScene(scene);
		control = new CifrarControl(this);
		
	}

	public Label getContrasenha() {
		return contrasenha;
	}

	public void setContrasenha(Label contrasenha) {
		this.contrasenha = contrasenha;
	}

	public TextField getPutContra() {
		return putContra;
	}

	public void setPutContra(TextField putContra) {
		this.putContra = putContra;
	}

	public Button getArchivoIn() {
		return archivoIn;
	}

	public void setArchivoIn(Button archivoIn) {
		this.archivoIn = archivoIn;
	}

	public Text getRutaIn() {
		return rutaIn;
	}

	public void setRutaIn(Text rutaIn) {
		this.rutaIn = rutaIn;
	}

	public Button getArchivoOut() {
		return archivoOut;
	}

	public void setArchivoOut(Button archivoOut) {
		this.archivoOut = archivoOut;
	}

	public Text getRutaOut() {
		return rutaOut;
	}

	public void setRutaOut(Text rutaOut) {
		this.rutaOut = rutaOut;
	}

	public Button getCifrar() {
		return cifrar;
	}

	public void setCifrar(Button cifrar) {
		this.cifrar = cifrar;
	}

	public CifrarControl getControl() {
		return control;
	}

	public void setControl(CifrarControl control) {
		this.control = control;
	}
	
	

}
