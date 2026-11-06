package com.fitmedia.fitapi.resource;

public class MealRequest {

    private String mealName;
    private String nutritions;
    private String mealType;
    private String mealDescription;

    public MealRequest() {
    }

    public MealRequest(String mealName,String nutritions,String mealType, String mealDescription) {
        this.mealName = mealName;
        this.nutritions = nutritions;
        this.mealType = mealType;
        this.mealDescription = mealDescription;
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

