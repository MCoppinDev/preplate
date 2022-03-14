package org.launchcode.preplate.models;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class User extends AbstractEntity {


    @ManyToMany
    private List<Meal> meals = new ArrayList<>();

    public User() {}

    public User(List<Meal> userMeals){
        this.meals= userMeals;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }


    // ***Implementing after initial functionality is present.***

//    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

//    @OneToOne(cascade = CascadeType.ALL)
//    private UserProfile userProfile;
//
//    @NotNull
//    @NotBlank
//    @Email
//    private String username;
//
//    @NotNull
//    @NotBlank
//    private String pwHash;
//


//    public UserProfile getUserProfile() {
//        return userProfile;
//    }
//
//    public void setUserProfile(UserProfile userProfile) {
//        this.userProfile = userProfile;
//    }
//
//
//    public User(String username, String password) {
//        this.username = username;
//        this.pwHash = password;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public boolean isMatchingPassword(String password) {
//        return encoder.matches(password, pwHash);
//    }

}
