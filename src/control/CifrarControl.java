package control;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import javafx.application.Platform;
import model.DesCifrador;
import model.generatorSHA1;
import view.Cifrar;

/**
 * Clase que realiza las acciones de la interfáz de la ventana de Cifrar.
 */
public class CifrarControl {

	private Cifrar view;
	private DesCifrador DesCi;
	private File FIn;
	private File FOut;
	private generatorSHA1 sha1;

	/**
	 * Crea una nueva instancia de CifrarControl.
	 * 
	 * @param view Vista de la ventana de Cifrar.
	 */
	public CifrarControl(Cifrar view) {
		this.view = view;
		DesCi = new DesCifrador();
		sha1 = new generatorSHA1();
		init();
	}

	/**
	 * Iniciaiza las acciones de los botones para elegir los archivos para el
	 * proceso de cifrado, y el botón para iniciar el proceso de cifrado.
	 */
	public void init() {
		// Archivo Input
		view.getArchivoIn().setOnAction((e) -> {
			Platform.runLater(() -> {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.showOpenDialog(fileChooser);
				view.getRutaIn().setText(fileChooser.getSelectedFile().getAbsolutePath());
				FIn = new File(fileChooser.getSelectedFile().getAbsolutePath());
			});
		});
		// Archivo Output
		view.getArchivoOut().setOnAction((e) -> {
			Platform.runLater(() -> {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.showOpenDialog(fileChooser);
				view.getRutaOut().setText(fileChooser.getSelectedFile().getAbsolutePath());
				FOut = new File(fileChooser.getSelectedFile().getAbsolutePath());
			});
		});
		// Botón Cifrar
		view.getCifrar().setOnAction((e) -> {
			try {
				String nombre = JOptionPane.showInputDialog("Introduzca el nombre del archivo sha-1");
				DesCi.processFile(true, FIn, view.getPutContra().getText(), FOut);
				sha1.FileSHA1(FIn, nombre);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});

	}

}
