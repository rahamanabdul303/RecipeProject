package com.cp.food.demoFood.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cp.food.demoFood.service.*;
import com.cp.food.demoFood.entity.Recipe;
import com.cp.food.demoFood.repository.*;

@Service
public class RecipeServiceImpl implements RecipeService {

	@Autowired
	private RecipeRepository recipeRepository;
	
	
	
	@Override
	public List<Recipe> recipesList() {
		
		return recipeRepository.findAll();
		
		
	}
	
	@Override
	public Recipe addRecipe(Recipe recipe) {
		
		return recipeRepository.save(recipe);
		
	}

	public void updateRecipe(Recipe recipe)  {
		
		recipeRepository.save(recipe);
		
		
	}

	
	@Override
	public void deleteRecipe(int recipeId) {
		
		recipeRepository.deleteById(recipeId);
	}

	@Override
	public Recipe getRecipe(int recipeId) {
		
		return recipeRepository.findById(recipeId).get();
		
		
	}

	
}
