package com.example.mongorecipesaver.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
@Data
public class Author {
    @MongoId
    private String id;

    @Field
    private String name;
}
