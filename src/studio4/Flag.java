package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.point(0.5, 0.5);
		StdDraw.setPenColor(0, 91, 187);
		StdDraw.filledRectangle(0.5, 0.35, 0.4, 0.15);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.rectangle(0.5, 0.5, 0.4, 0.30);
		StdDraw.setPenColor(0, 48, 135);
		StdDraw.filledCircle(0.5, 0.5, 0.15);
	}
}