package model;

import Exception.NegativeNumberException;

public class Ingredient {
	private String name;
	private double weight;
	
	public Ingredient(String n, double w) {
		name = n;
		weight = w;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void addWeight(double additionalW) throws NegativeNumberException {
		if (additionalW>0) {
			weight = weight + additionalW;
		} else {
			throw new NegativeNumberException();
		}
	}
	
	public void menusWeight(double menusW) throws NegativeNumberException {
		if (menusW>0) {
			weight = weight - menusW;
		} else {
			throw new NegativeNumberException();
		}
	}
	
}
