package com.example.mongorecipesaver.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

import java.util.HashMap;

@Getter
@Builder
@Jacksonized
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecipeDto {

    private String title;

    private String description;

    private HashMap<String, String> ingredients;

    private String authorName;

}
