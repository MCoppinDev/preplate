package org.launchcode.preplate.models;

import java.util.ArrayList;
import java.util.List;

public class Meal extends AbstractEntity{

    private String recipe;

    private List<Ingredient> ingredients = new ArrayList<>();

    public Meal(){}

    public Meal(String recipe, List<Ingredient> ingredients){
        this.recipe = recipe;
        this.ingredients = ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }


}
