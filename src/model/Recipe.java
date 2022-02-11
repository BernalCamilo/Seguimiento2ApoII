package model;

import java.util.ArrayList;
import java.util.List;

import Exception.NegativeNumberException;

public class Recipe {
	private List<Ingredient> ingredients;
	
	public Recipe() {
		ingredients = new ArrayList<Ingredient>();
	}
	
	public void addIngredient(String n, double w) {
		
		Ingredient searched = null;
		for (int i = 0; i < ingredients.size() && searched==null; i++) {
			Ingredient current = ingredients.get(i);
			if(current.getName().equals(n)) {
				searched = current;
			}
		}
		
		if(searched!=null) {
			try {
				searched.addWeight(w);
			} catch (NegativeNumberException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			Ingredient newIngredient = new Ingredient(n, w);
			ingredients.add(newIngredient);
		}		
	}
	
	public void removeIngredient(String name) {
		Ingredient searched = null;
		for (int i = 0; i < ingredients.size() && searched==null; i++) {
			if(ingredients.get(i).getName().equals(name)){
				ingredients.remove(i);
			}
		}
	}
	
	public List<Ingredient> getIngredients(){
		return ingredients;
	}
}
