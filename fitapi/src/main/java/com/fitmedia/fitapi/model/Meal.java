package com.fitmedia.fitapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("meals")
public class Meal {

    @Id
    private String id;

    private String mealName;

    private String nutritions;

    private String mealType;

    private String mealDescription;

    public Meal() {
    }

    public Meal(String mealName,String nutritions,String mealType,String mealDescription) {
        this.mealName = mealName;
        this.nutritions = nutritions;
        this.mealType = mealType;
        this.mealDescription = mealDescription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getNutritions() {
        return nutritions;
    }

    public void setNutritions(String nutritions) {
        this.nutritions = nutritions;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getMealDescription() {
        return mealDescription;
    }

    public void setMealDescription(String mealDescription) {
        this.mealDescription = mealDescription;
    }
}

