package model.dao;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class SpriteReader {
	public static final int SIZE = 0;
	private ArrayList<Image> sprites;
	private String path;

	public SpriteReader(String path) {
		this.path = path;
		this.sprites = new ArrayList<Image>();
		try {
			this.generateImagesList();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void generateImagesList() throws IOException {
		File folder = new File(getClass().getClassLoader().getResource(path).getFile()).getAbsoluteFile();
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			sprites.add(ImageIO.read(listOfFiles[i].getAbsoluteFile()));
		}
	}

	public ArrayList<Image> getSprites() {
		return sprites;
	}

}