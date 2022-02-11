package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipeTest {
	private Recipe recipe;

	public void setupStage1 () {
		recipe=new Recipe();
	}
	
	public void setupStage2 () {
		recipe=new Recipe();
		recipe.addIngredient("Cebolla", 315);
		recipe.addIngredient("Ajo", 58);
		recipe.addIngredient("Arroz", 520);
	}
	
	@Test
	void prueba1() {
		String name="Sal";
		double peso=12;
		setupStage1();
		recipe.addIngredient(name, peso);
		//Ingredient ingredient = recipe.getIngredients().get(0);
		//assertEquals(name, ingredient.getName());
		
		
		assertEquals(recipe.getIngredients().size(), 1);
		assertEquals(name, recipe.getIngredients().get(0).getName());
		assertEquals(peso, recipe.getIngredients().get(0).getWeight());
	}
	
	@Test
	void prueba2 () {
		setupStage2();
		String name="Pimienta";
		double peso = 6;
		recipe.addIngredient(name, peso);
		int tamano = recipe.getIngredients().size()-1;
		
		
		assertEquals(recipe.getIngredients().size(), 4);
		assertEquals(name, recipe.getIngredients().get(tamano).getName());
		assertEquals(peso, recipe.getIngredients().get(tamano).getWeight());
	}
	
	@Test
	void prueba3() {
		setupStage2();
		String name="Ajo";
		double peso = 21;
		recipe.addIngredient(name, peso);
		
		int tamano = recipe.getIngredients().size()-1;
		assertEquals(recipe.getIngredients().size(), 3);
		assertEquals(recipe.getIngredients().get(1).getWeight(), 79);
	}
	
	@Test
	void prueba4 () {
		setupStage2();
		String name="Ajo";
		recipe.removeIngredient(name);
		
		assertEquals(recipe.getIngredients().size(), 2);
	}
	

}
