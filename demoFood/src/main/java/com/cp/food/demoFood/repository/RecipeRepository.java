package com.cp.food.demoFood.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cp.food.demoFood.entity.Ingredients;
import com.cp.food.demoFood.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

	@Query("SELECT r from Recipe r WHERE r.name=:name ")
	 public Optional<Recipe> findByName(@Param("name") String name);
}
