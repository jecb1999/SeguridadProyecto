package control;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import javafx.application.Platform;
import model.DesCifrador;
import model.generatorSHA1;
import view.Descifrar;

public class DescifrarControl {
	
	private Descifrar view;
	private DesCifrador DesCi;
	private generatorSHA1 generator;
	private File FIn;
	private File FOut;
	private File sha1;
	
	public DescifrarControl(Descifrar view) {
		this.view = view;
		DesCi = new DesCifrador();
		generator = new generatorSHA1();
		init();
	}

	public void init() {
		view.getArchivoIn().setOnAction((e) -> {
			Platform.runLater(()->{
				JFileChooser fileChooser = new JFileChooser();
		        fileChooser.showOpenDialog(fileChooser);
		        view.getRutaIn().setText(fileChooser.getSelectedFile().getAbsolutePath());
		        FIn = new File(fileChooser.getSelectedFile().getAbsolutePath());
			});
		});
		
		view.getArchivoOut().setOnAction((e) -> {
			Platform.runLater(()->{
				JFileChooser fileChooser = new JFileChooser();
		        fileChooser.showOpenDialog(fileChooser);
		        view.getRutaOut().setText(fileChooser.getSelectedFile().getAbsolutePath());
		        FOut = new File(fileChooser.getSelectedFile().getAbsolutePath());
			});
		});
		
		view.getDescifrar().setOnAction((e) -> {
			try {
				DesCi.processFile(false, FIn, view.getPutContra().getText(), FOut);
				String compare = generator.txtToStiring(sha1);
				if(generator.StringSHA1(FOut).equals(compare)) {
					JOptionPane.showMessageDialog(null, "Hash equivalnete se puede confiar en el archivo descifrado", "Exito", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Hash no equivalnete no se puede confiar en el archivo descifrado", "Error", JOptionPane.ERROR_MESSAGE);
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		view.getSha1().setOnAction((e) -> {
			Platform.runLater(()->{
				JFileChooser fileChooser = new JFileChooser();
		        fileChooser.showOpenDialog(fileChooser);
		        view.getTextSha1().setText(fileChooser.getSelectedFile().getAbsolutePath());
		        sha1 = new File(fileChooser.getSelectedFile().getAbsolutePath());
			});
		});
		
		
	}

}
