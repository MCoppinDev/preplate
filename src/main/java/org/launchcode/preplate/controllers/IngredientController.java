package org.launchcode.preplate.controllers;

import org.launchcode.preplate.data.IngredientRepository;
import org.launchcode.preplate.models.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("ingredients")
public class IngredientController {

    @Autowired
    IngredientRepository ingredientRepository;

    @GetMapping
    public String displayAllIngredients(Model model) {
        model.addAttribute("title", "All Ingredients");
        model.addAttribute("tags", ingredientRepository.findAll());
        return "ingredients/index";
    }

    @GetMapping("create")
    public String displayCreateIngredient(Model model) {
        model.addAttribute("title", "Create Tag");
        model.addAttribute(new Ingredient());
        model.addAttribute("ingredients",ingredientRepository.findAll());
        return "ingredients/create";
    }

    @PostMapping("create")
    public String processCreateIngredient(@ModelAttribute @Valid Ingredient newIngredient,
                                       Errors errors, Model model) {


        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Ingredient");
            return "ingredients/create";
        }

        ingredientRepository.save(newIngredient);
        return "redirect:create";
    }

    @GetMapping("delete")
    public String displayDeleteIngredients(Model model) {
        model.addAttribute("title", "Delete Ingredient");
        model.addAttribute("ingredients", ingredientRepository.findAll());
        return "ingredients/delete";
    }

    @PostMapping("delete")
    public String processDeleteIngredientsForm(@RequestParam(required = false) int[] ingredientIds) {

        if (ingredientIds != null) {
            for (int id : ingredientIds) {
                ingredientRepository.deleteById(id);
            }
        }

        return "redirect:delete";
    }


}
