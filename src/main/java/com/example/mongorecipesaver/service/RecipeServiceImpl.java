package com.example.mongorecipesaver.service;

import com.example.mongorecipesaver.dto.RecipeDto;
import com.example.mongorecipesaver.exceptions.NotFoundException;
import com.example.mongorecipesaver.model.Author;
import com.example.mongorecipesaver.model.Recipe;
import com.example.mongorecipesaver.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;


    @Override
    public String createRecipe(RecipeDto dto) {
        Recipe recipe = new Recipe();
        Author author = new Author();
        author.setName(dto.getAuthorName());
        recipe.setTitle(dto.getTitle());
        recipe.setDescription(dto.getDescription());
        recipe.setIngredients(dto.getIngredients());
        recipe.setAuthor(author);
        return recipeRepository.save(recipe).getId();
    }

    @Override
    public Recipe getRecipe(String recipeId) {
        Recipe recipe = getOrThrow(recipeId);
        return recipe;
    }

    private Recipe getOrThrow(String recipeId) {
        return recipeRepository.findById(recipeId)
                .orElseThrow(() -> new NotFoundException("Recipe with id '%s' not found".formatted(recipeId)));
    }
}
