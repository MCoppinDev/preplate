package org.launchcode.preplate.controllers;

import org.launchcode.preplate.data.MealRepository;
import org.launchcode.preplate.data.UserRepository;
import org.launchcode.preplate.models.Meal;
import org.launchcode.preplate.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    private MealRepository mealRepository;


    @RequestMapping("mymeals")
    public String displayMyMeals(Model model){
        model.addAttribute("title","My Meals");
        model.addAttribute("mealList", userRepository.findAll());
        return"meals/mymeals";


    }

    @PostMapping("result")
    public String processMyMeals(@RequestParam int userId, Model model){

        List<Meal> selectedList;

        Optional<User> userObj = userRepository.findById(userId);

        if(userObj.isPresent()){

            User userList = userObj.get();

            selectedList = userList.getMeals();



        }
        selectedList = (List<Meal>)mealRepository.findAll();
        model.addAttribute("selectedList", selectedList);


        return "mymeals";


    }


}
