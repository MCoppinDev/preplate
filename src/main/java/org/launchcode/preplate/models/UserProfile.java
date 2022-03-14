//package org.launchcode.preplate.models;
//
//import javax.persistence.Entity;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class UserProfile extends AbstractEntity{
//
//    @OneToOne
//    private User user;
//
//    @ManyToMany
//    private List<Meal> userMeals = new ArrayList<>();
//
//    @ManyToMany
//    private List<Ingredient> allergies = new ArrayList<>();
//
//    public UserProfile(){}
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public List<Ingredient> getAllergies() {
//        return allergies;
//    }
//
//    public void setAllergies(List<Ingredient> allergies) {
//        this.allergies = allergies;
//    }
//
//    public List<Meal> getUserMeals() {
//        return userMeals;
//    }
//
//    public void setUserMeals(List<Meal> userMeals) {
//        this.userMeals = userMeals;
//    }
//}
