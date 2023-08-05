package com.example.mongorecipesaver.controller;


import com.example.mongorecipesaver.model.Recipe;
import com.example.mongorecipesaver.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class RecipeSaverController {
    @Autowired
    RecipeService recipeService;

    @GetMapping("/")
    public String getMainPage(){
        return "";
    }

    @PostMapping("/")
    public void getNewRecipe(@RequestBody Recipe Recipe){

    }

}
