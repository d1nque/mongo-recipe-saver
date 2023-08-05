package com.example.mongorecipesaver.repository;

import com.example.mongorecipesaver.model.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipe, String> {

}
