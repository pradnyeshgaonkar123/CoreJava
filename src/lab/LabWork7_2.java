package lab;

import java.awt.Font;

public class LabWork7_2 {
	public static void main(String[] args) {
		Font f;
		f = new Font("TimesNewRoman",Font.BOLD+Font.ITALIC,12);
		String font = f.getName();
		int style = f.getStyle();
		int size = f.getSize();
		boolean bold = f.isBold();
		boolean normal = f.isPlain();
		boolean italic = f.isItalic();
		
		System.out.println("Font : "+font+ "\nStyle : "+style+"\nSize : "+size+"\nBold : "+bold+"\nPlain : "+normal+"\nItalic : "+italic);
		
	}
}
