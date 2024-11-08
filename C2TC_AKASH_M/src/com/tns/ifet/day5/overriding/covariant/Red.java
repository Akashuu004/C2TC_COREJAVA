package com.tns.ifet.day5.overriding.covariant;

class Red extends Color {
	@Override
	public Red getColor() {
		Red s = new Red();
		return s;
	}
}