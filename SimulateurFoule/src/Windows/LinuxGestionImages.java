package Windows;

import java.awt.Image;
import java.io.File;

public class LinuxGestionImages {
	
	public Image getSouris() {
		final File f = new File("");
		String fichier = "src/ressource/Mouse.png";
		final String fichierPath = f.getAbsolutePath() + File.separator + fichier;
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage(fichierPath);
		return image;
	}
	
	public Image getMur() {
		final File f = new File("");
		String fichier = "src/ressource/Wall.png";
		final String fichierPath = f.getAbsolutePath() + File.separator + fichier;
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage(fichierPath);
		return image;
	}
	
	public Image getRoute() {
		final File f = new File("");
		String fichier = "src/ressource/Road.png";
		final String fichierPath = f.getAbsolutePath() + File.separator + fichier;
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage(fichierPath);
		return image;
	}
	
	public Image getPorte() {
		final File f = new File("");
		String fichier = "src/ressource/Door.png";
		final String fichierPath = f.getAbsolutePath() + File.separator + fichier;
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage(fichierPath);
		return image;
	}
	
	public Image getHerbe() {
		final File f = new File("");
		String fichier = "src/ressource/Grass.png";
		final String fichierPath = f.getAbsolutePath() + File.separator + fichier;
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage(fichierPath);
		return image;
	}
	
	public Image getFromage() {
		final File f = new File("");
		String fichier = "src/ressource/Cheese.png";
		final String fichierPath = f.getAbsolutePath() + File.separator + fichier;
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage(fichierPath);
		return image;
	}
}
