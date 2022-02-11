package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exception.NegativeNumberException;

class IngredientTest {
	
	private Ingredient ingreniet;

	public void setupStage1 () {
		ingreniet=new Ingredient("Tomate", 245);
	}
	
	
	@Test
	void prueba1() {
		setupStage1();
		double peso = 54;
		boolean exceptionProba=false;
		try {
			ingreniet.addWeight(peso);
		} catch (NegativeNumberException ex) {
			exceptionProba=true;
		}
		
		assertEquals(ingreniet.getWeight(), 299);
		assertTrue(!exceptionProba);
	}
	
	@Test
	void prueba2() {
		setupStage1();
		double peso = -100;
		boolean exceptionProba=false;
		try {
			ingreniet.addWeight(peso);
		} catch (NegativeNumberException ex) {
			exceptionProba=true;
		}
		
		assertEquals(ingreniet.getWeight(), 245);
		assertTrue(exceptionProba);	
	}
	
	@Test
	void prueba3(){
		setupStage1();s
		double pesoQuitar = 45;
		boolean exceptionProba=false;
		try {
			ingreniet.menusWeight(pesoQuitar);
		}catch(NegativeNumberException ex) {
			exceptionProba=true;
		}
		
		assertEquals(ingreniet.getWeight(), 200);
		assertTrue(!exceptionProba);
	}
	
	@Test
	void prueba4() {
		setupStage1();
		double pesoQuitar = -100;
		boolean exceptionProba=false;
		try {
			ingreniet.menusWeight(pesoQuitar);
		}catch(NegativeNumberException ex) {
			exceptionProba=true;
		}
		
		assertEquals(ingreniet.getWeight(), 245);
		assertTrue(exceptionProba);

	}

}
