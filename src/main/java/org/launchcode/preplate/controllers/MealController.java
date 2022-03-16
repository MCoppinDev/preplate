package org.launchcode.preplate.controllers;

import org.launchcode.preplate.data.IngredientRepository;
import org.launchcode.preplate.data.MealRepository;
import org.launchcode.preplate.data.UserRepository;
import org.launchcode.preplate.models.Ingredient;
import org.launchcode.preplate.models.Meal;
import org.launchcode.preplate.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value="meals")
public class MealController {

    @Autowired
    private MealRepository mealRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private IngredientRepository ingredientRepository;


    @GetMapping("")
    public String displayMeals( Model model) {
        model.addAttribute("title", "Meals");
        model.addAttribute("meals", mealRepository.findAll());
        model.addAttribute(new User());

        return "meals/index";

    }

    @PostMapping("")
    public String processSaveMeals(Model model, @RequestParam List<Integer>meals, User user ){

        user = new User();

        List<Meal> mealObjs = (List<Meal>) mealRepository.findAllById(meals);
        user.setMeals(mealObjs);

        userRepository.save(user);

        return"redirect:";
    }

    @GetMapping("mymeals")
    public String displayMyMeals(Model model){
        model.addAttribute("title","My Meals");

        return"meals/mymeals";

    }


}
