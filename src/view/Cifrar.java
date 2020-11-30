package view;

import control.CifrarControl;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Clase que muestra la vista para cifrar.
 */
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

	/**
	 * Crea una nueva instancia de Cifrar.
	 */
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

	/**
	 * Retorna el label para el campo de contrase�a.
	 * 
	 * @return Label de contrase�a.
	 */
	public Label getContrasenha() {
		return contrasenha;
	}

	/**
	 * Cambia el label para el campo de contrase�a.
	 * 
	 * @param contrasenha Nuevo label de contrase�a.
	 */
	public void setContrasenha(Label contrasenha) {
		this.contrasenha = contrasenha;
	}

	/**
	 * Retorna el input de la contrase�a.
	 * 
	 * @return Input de contrase�a.
	 */
	public TextField getPutContra() {
		return putContra;
	}

	/**
	 * Cambia el input de la contrase�a.
	 * 
	 * @param putContra Nuevo input para contrase�a.
	 */
	public void setPutContra(TextField putContra) {
		this.putContra = putContra;
	}

	/**
	 * Retorna el bot�n para selecionar el archivo de entrada.
	 * 
	 * @return Bott�n para el archivo de entrada.
	 */
	public Button getArchivoIn() {
		return archivoIn;
	}

	/**
	 * Cambia el bot�n para selecionar el archivo de entrada.
	 * 
	 * @param archivoIn Nuevo bott�n para el archivo de entrada
	 */
	public void setArchivoIn(Button archivoIn) {
		this.archivoIn = archivoIn;
	}

	/**
	 * Retorna el elemento que muestra el texto del archivo de entrada.
	 * 
	 * @return Text del archivo de entrada
	 */
	public Text getRutaIn() {
		return rutaIn;
	}

	/**
	 * Cambia el elemento que muestra el texto del archivo de entrada.
	 * 
	 * @param rutaIn Nuevo Text del archivo de entrada.
	 */
	public void setRutaIn(Text rutaIn) {
		this.rutaIn = rutaIn;
	}

	/**
	 * Retorna el bot�n para selecionar el archivo de salida.
	 * 
	 * @return Bot�n del archivo de salida.
	 */
	public Button getArchivoOut() {
		return archivoOut;
	}

	/**
	 * Cambia Cambia el bot�n para selecionar el archivo de salida.
	 * 
	 * @param archivoOut Nuevo bot�n del archivo de salida.
	 */
	public void setArchivoOut(Button archivoOut) {
		this.archivoOut = archivoOut;
	}

	/**
	 * Retorna el elemento que muestra el texto del archivo de salida.
	 * 
	 * @return Text del archivo de salida.
	 */
	public Text getRutaOut() {
		return rutaOut;
	}

	/**
	 * Cambia el elemento que muestra el texto del archivo de salida.
	 * 
	 * @param archivoOut Nuevo Text del archivo de salida.
	 */
	public void setRutaOut(Text rutaOut) {
		this.rutaOut = rutaOut;
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
	 * @param descifrar Nuevo bot�n para cifrar.
	 */
	public void setCifrar(Button cifrar) {
		this.cifrar = cifrar;
	}

	/**
	 * Retorna el elemento que realiza la acci�n de cifrar.
	 * 
	 * @return Elemento que cifra.
	 */
	public CifrarControl getControl() {
		return control;
	}

	/**
	 * Cambia al elemento que realiza la acci�n de cifrar.
	 * 
	 * @param control Nuevo elemento que cifra.
	 */
	public void setControl(CifrarControl control) {
		this.control = control;
	}
}
