package view;

import control.CifrarControl;
import control.DescifrarControl;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Clase que muestra la vista para descifrar.
 */
public class Descifrar extends Stage {

	private Label contrasenha;
	private TextField putContra;
	private Button archivoIn;
	private Text rutaIn;
	private Button archivoOut;
	private Text rutaOut;
	private Button sha1;
	private Text textSha1;
	private Button descifrar;
	private Scene scene;
	private DescifrarControl control;

	/**
	 * Crea una nueva instancia de Descifrar.
	 */
	public Descifrar() {
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
		sha1 = new Button("Archivo SHA-1");
		sha1.setLayoutX(127);
		sha1.setLayoutY(166);
		textSha1 = new Text();
		textSha1.setLayoutX(273);
		textSha1.setLayoutY(183);
		rutaOut.setWrappingWidth(149.0000031888485);
		descifrar = new Button("DESCIFRAR");
		descifrar.setLayoutX(221);
		descifrar.setLayoutY(234);

		AnchorPane ap = new AnchorPane();
		ap.setPrefHeight(265);
		ap.setPrefWidth(497);
		ap.getChildren().add(contrasenha);
		ap.getChildren().add(putContra);
		ap.getChildren().add(archivoIn);
		ap.getChildren().add(rutaIn);
		ap.getChildren().add(rutaOut);
		ap.getChildren().add(archivoOut);
		ap.getChildren().add(sha1);
		ap.getChildren().add(textSha1);
		ap.getChildren().add(descifrar);

		scene = new Scene(ap);
		this.setScene(scene);
		control = new DescifrarControl(this);

	}

	/**
	 * Retorna el label para el campo de contraseña.
	 * 
	 * @return Label de contraseña.
	 */
	public Label getContrasenha() {
		return contrasenha;
	}

	/**
	 * Cambia el label para el campo de contraseña.
	 * 
	 * @param contrasenha Nuevo label de contraseña.
	 */
	public void setContrasenha(Label contrasenha) {
		this.contrasenha = contrasenha;
	}

	/**
	 * Retorna el input de la contraseña.
	 * 
	 * @return Input de contraseña.
	 */
	public TextField getPutContra() {
		return putContra;
	}

	/**
	 * Cambia el input de la contraseña.
	 * 
	 * @param putContra Nuevo input para contraseña.
	 */
	public void setPutContra(TextField putContra) {
		this.putContra = putContra;
	}

	/**
	 * Retorna el botón para selecionar el archivo de entrada.
	 * 
	 * @return Bottón para el archivo de entrada.
	 */
	public Button getArchivoIn() {
		return archivoIn;
	}

	/**
	 * Cambia el botón para selecionar el archivo de entrada.
	 * 
	 * @param archivoIn Nuevo bottón para el archivo de entrada
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
	 * Retorna el botón para selecionar el archivo de salida.
	 * 
	 * @return Botón del archivo de salida.
	 */
	public Button getArchivoOut() {
		return archivoOut;
	}

	/**
	 * Cambia Cambia el botón para selecionar el archivo de salida.
	 * 
	 * @param archivoOut Nuevo botón del archivo de salida.
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
	 * Retorna el botón para descifrar.
	 * 
	 * @return Botón para descifrar.
	 */
	public Button getDescifrar() {
		return descifrar;
	}

	/**
	 * Cambia el botón para descifrar.
	 * 
	 * @param descifrar Nuevo botón para descifrar.
	 */
	public void setDescifrar(Button descifrar) {
		this.descifrar = descifrar;
	}

	/**
	 * Retorna el botón para actualizar la ruta de del SHA1.
	 * 
	 * @return Botón para el SHA1.
	 */
	public Button getSha1() {
		return sha1;
	}

	/**
	 * Cambia el botón para actualizar la ruta de del SHA1.
	 * 
	 * @param sha1 Nuevo botón para el SHA1.
	 */
	public void setSha1(Button sha1) {
		this.sha1 = sha1;
	}

	/**
	 * Retorna el elemento que muestra el texto del SHA1.
	 * 
	 * @return Text del SHA1.
	 */
	public Text getTextSha1() {
		return textSha1;
	}

	/**
	 * Cambia el elemento que muestra el texto del SHA1.
	 * 
	 * @param textSha1 Nuevo Text del SHA1.
	 */
	public void setTextSha1(Text textSha1) {
		this.textSha1 = textSha1;
	}

}
