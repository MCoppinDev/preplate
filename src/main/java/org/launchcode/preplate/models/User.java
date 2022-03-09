package org.launchcode.preplate.models;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class User extends AbstractEntity {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @NotNull
    @NotBlank
    @Email
    @Size(min = 4, max = 20)
    private String email;

    @NotNull
    @NotBlank
    private String pwHash;

    private List<Meal> meals = new ArrayList<>();

    private List<Ingredient> allergies = new ArrayList<>();

    public User() {}



    public User(String email, String password) {
        this.email = email;
        this.pwHash = encoder.encode(password);
    }

    public String getEmail() {
        return email;
    }

    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, this.pwHash);
    }

}
