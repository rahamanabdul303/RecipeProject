package com.cp.food.demoFood.service;

import java.util.List;

import com.cp.food.demoFood.entity.*;
import com.cp.food.demoFood.exception.*;
public interface RecipeService {

	public List<Recipe> recipesList();

	public Recipe addRecipe(Recipe recipe);

	public void updateRecipe(Recipe recipe);

	public void deleteRecipe(int recipeId);
	
	public Recipe getRecipe(int recipeId);
}
