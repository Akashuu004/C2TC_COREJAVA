package com.tns.ifet.day5.overriding.covariant;

class Color {
	// method getcolor returns an object of type color
	protected Color getColor() {
		Color s = new Color();
		return s;
	}
}
