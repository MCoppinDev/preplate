package org.launchcode.preplate.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Ingredient extends AbstractEntity{


    @ManyToMany(mappedBy = "ingredients")
    private List<Meal> forMeals;

//    @ManyToMany(mappedBy = "allergies")
//    private List<UserProfile> userProfiles;
//    private Integer amount;


    public Ingredient (){}

    public Ingredient(String name){
        this.setName(name);
    }

    public List<Meal> getMeals() {
        return forMeals;
    }

    public void setMeals(List<Meal> meals) {
        this.forMeals = meals;
    }

//    public List<UserProfile> getUserProfiles() {
//        return userProfiles;
//    }
//
//    public void setUserProfiles(List<UserProfile> userProfiles) {
//        this.userProfiles = userProfiles;
//    }



}
