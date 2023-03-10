package com.elishai.game.main;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Resources {
	
	public static BufferedImage welcome, iconimage;
	
	public static void load() {
		welcome = loadImage("welcome.png");
		iconimage = loadImage("iconimage.png");
	}
	
	private static AudioClip loadSound(String fileName) {
		URL fileURL = Resources.class.getResource("/resources/" + fileName);
		return Applet.newAudioClip(fileURL);
	}
	
	private static BufferedImage loadImage(String fileName) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(Resources.class.getResourceAsStream("/resources/" + fileName));
		} catch (IOException e) {
			System.out.println("Error while reading: " + fileName);
			e.printStackTrace();
		}
		return img;
	}
}
