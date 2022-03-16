package org.launchcode.preplate.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Meal extends AbstractEntity{

//    @OneToOne(cascade = {CascadeType.ALL})
//    private Recipe recipe;

    private String description;


//    ** Relationship for User Class **
//    @ManyToMany(mappedBy = "userMeals")
//    private List<UserProfile> userProfile = new ArrayList<>();


    @ManyToMany
    private List<Ingredient> ingredients = new ArrayList<>();

    public Meal(){}

    public Meal(String name, String description, List<Ingredient> ingredients){
        this.setName(name);
        this.description = description;
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }



}
