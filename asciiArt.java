package asciiArt;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class asciiArt {

	public static void main(String[] args) {
		BufferedImage img = null;
		try {
			File pic = new File("flower.jpg");
			img = ImageIO.read(pic);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		int height = img.getHeight();
		int width = img.getWidth();
		
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				int pixel = img.getRGB(x, y);
				int r = (pixel >> 16) & 0xff;
				int g = (pixel >> 8) & 0xff;
				int b = (pixel) & 0xff;
				
				float avg = (r + g + b) / 3;
				
				if (avg >= 0 && avg < 15) {
				    System.out.print("·");
				} else if (avg >= 15 && avg < 30) {
				    System.out.print(":");
				} else if (avg >= 30 && avg < 45) {
				    System.out.print("-");
				} else if (avg >= 45 && avg < 60) {
				    System.out.print("~");
				} else if (avg >= 60 && avg < 75) {
				    System.out.print("+");
				} else if (avg >= 75 && avg < 90) {
				    System.out.print("=");
				} else if (avg >= 90 && avg < 105) {
				    System.out.print("?");
				} else if (avg >= 105 && avg < 120) {
				    System.out.print("!");
				} else if (avg >= 120 && avg < 135) {
				    System.out.print("&");
				} else if (avg >= 135 && avg < 150) {
				    System.out.print("$");
				} else if (avg >= 150 && avg < 165) {
				    System.out.print("%");
				} else if (avg >= 165 && avg < 180) {
				    System.out.print("^");
				} else if (avg >= 180 && avg < 195) {
				    System.out.print("*");
				} else if (avg >= 195 && avg < 210) {
				    System.out.print("#");
				} else if (avg >= 210 && avg < 225) {
				    System.out.print("@");
				} else {
				    System.out.print("!");
				}
			} 
			
			System.out.println();
		}
	}

}
