package com.example.mongorecipesaver.service;

import com.example.mongorecipesaver.dto.RecipeDto;
import com.example.mongorecipesaver.model.Recipe;

public interface RecipeService {

    String createRecipe(RecipeDto dto);

    Recipe getRecipe(String recipeId);



}
