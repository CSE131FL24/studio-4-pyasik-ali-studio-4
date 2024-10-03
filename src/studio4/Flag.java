package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenRadius(.5);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(.5,.5,.25);
		StdDraw.filledCircle(.75, .75,.15 );
		StdDraw.filledCircle(.25, .75, .15);
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.filledCircle(.33, .5, .05);
		StdDraw.filledCircle(.66, .5, .05);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(.33, .5, .02);
		StdDraw.filledCircle(.66, .5, .02);
	}
}