package lab;

import java.awt.*;
public class ColorChecking {
	public static void main(String arg[]) {
		Color rgb;
		System.out.println("RGB Combination");
		rgb = new Color(193, 255, 183);
		int red, green, blue;
		red = rgb.getRed();
		green = rgb.getGreen();
		blue = rgb.getBlue();
		float x[] = { 0.0f, 0.0f, 0.0f };
		Color.RGBtoHSB(red, green, blue, x);
		System.out.println("RGB Combination");
		System.out.println("Red : " + red + "Green: " + green + "Blue : " + blue);
		System.out.println("Hue : " + x[0] + "Saturation: " + x[1] + "Brightness: " + x[2]);
		int r = Color.HSBtoRGB (0.76f,0.2375f,0.95f); 
		System.out.println("\n HSB Combination");
		System.out.println(" Red, Blue and Green Combination : " + r);
	}
}