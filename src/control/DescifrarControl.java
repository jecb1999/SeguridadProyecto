package control;

import java.io.File;

import javax.swing.JFileChooser;

import javafx.application.Platform;
import model.DesCifrador;
import view.Descifrar;

public class DescifrarControl {
	
	private Descifrar view;
	private DesCifrador DesCi;
	private File FIn;
	private File FOut;
	
	public DescifrarControl(Descifrar view) {
		this.view = view;
		DesCi = new DesCifrador();
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
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		
		
	}

}
