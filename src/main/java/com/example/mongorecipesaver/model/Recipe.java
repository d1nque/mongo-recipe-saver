package com.example.mongorecipesaver.model;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.HashMap;

@Data
@Document
public class Recipe {

    @MongoId
    private String id;

    @Field
    private String title;

    @Field
    private String description;

    @Field
    private HashMap<String, String> ingredients;

    @DBRef
    private Author author;
}
