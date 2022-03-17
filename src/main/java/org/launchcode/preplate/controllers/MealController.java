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
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("meals")
public class MealController {

    @Autowired
    private MealRepository mealRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    IngredientRepository ingredientRepository;


    @GetMapping("")
    public String displayAllMeals( Model model) {
        model.addAttribute("title", "Meals");
        model.addAttribute("meals", mealRepository.findAll());
        model.addAttribute(new User());

        return "meals/index";

    }

    @PostMapping("")
    public String processSaveMeals(@ModelAttribute @Valid User user, Errors errors,
                                   Model model,
                                   @RequestParam List<Integer>meals
    ){
        if (errors.hasErrors()) {
            model.addAttribute("title", "Meals");
            return "meals/index";
        }

        List<Meal> mealObjs = (List<Meal>) mealRepository.findAllById(meals);
        user.setMeals(mealObjs);

        userRepository.save(user);

        return"redirect:";
    }

    @GetMapping("add")
    public String displayAddMealForm(Model model){
        model.addAttribute(new Meal());
        model.addAttribute("title", "Add Meal");
        return"add";
    }

    @PostMapping("add")
    public String processAddMealForm(@ModelAttribute @Valid Meal newMeal,
                                    Errors errors, Model model,  @RequestParam List<Integer> ingredients) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Meal");
            return "add";
        }

        List<Ingredient> ingredientsObjs = (List<Ingredient>) ingredientRepository.findAllById(ingredients);
        newMeal.setIngredients(ingredientsObjs);

        mealRepository.save(newMeal);
        return "redirect:";

    }



    @GetMapping("mymeals")
    public String displayMyMeals(Model model){
        model.addAttribute("title","My Meals");
        model.addAttribute("mealList", userRepository.findAll());
        return"meals/mymeals";


    }

    @PostMapping("mymeals")
    public String processMyMeals(@RequestParam int userId, Model model){

        List<Meal>selectedList;

       Optional<User> userObj = userRepository.findById(userId);

       if(userObj.isPresent()){

           User userList = userObj.get();

           String listName = userList.getName();

            selectedList = userList.getMeals();



           model.addAttribute("selectedList", selectedList);
           model.addAttribute("listName", listName);

       }
//        selectedList = (List<Meal>)mealRepository.findAll();

        return "meals/mymeals";


    }


}
