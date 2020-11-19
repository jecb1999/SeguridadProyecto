package control;

import java.io.File;

import javax.swing.JFileChooser;

import javafx.application.Platform;
import model.DesCifrador;
import view.Cifrar;

public class CifrarControl {
	
	private Cifrar view;
	private DesCifrador DesCi;
	private File FIn;
	private File FOut;
	
	public CifrarControl(Cifrar view) {
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
		
		view.getCifrar().setOnAction((e) -> {
			try {
				DesCi.processFile(true, FIn, view.getPutContra().getText(), FOut);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		
		
	}
	

}
