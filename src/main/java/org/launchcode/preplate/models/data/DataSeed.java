package org.launchcode.preplate.models.data;

import org.launchcode.preplate.data.IngredientRepository;
import org.launchcode.preplate.data.MealRepository;
//import org.launchcode.preplate.data.RecipeRepository;
import org.launchcode.preplate.models.Ingredient;
import org.launchcode.preplate.models.Meal;
//import org.launchcode.preplate.models.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataSeed implements CommandLineRunner{

    @Autowired
    MealRepository mealRepository;
    @Autowired
    IngredientRepository ingredientRepository;
//    @Autowired
//    RecipeRepository recipeRepository;

    @Override
    public void run(String... args)throws Exception {
        loadMealData();
    }

    private void loadMealData() {

        Ingredient salmon = new Ingredient("Salmon");
        Ingredient coconutFlakes = new Ingredient("Unsweetened Coconut Flakes");
        Ingredient macadamiaNuts = new Ingredient("Macadamia Nuts");
        Ingredient coconutOil = new Ingredient("Coconut Oil");
        Ingredient seaSalt = new Ingredient("Sea Salt");
        Ingredient pepper = new Ingredient("Pepper");
        Ingredient beefShortRib = new Ingredient("Beef Short Rib");
        Ingredient daikonRadish = new Ingredient("Daikon Radish");
        Ingredient whiteOnion = new Ingredient("White Onion");
        Ingredient carrot = new Ingredient("Carrot");
        Ingredient lemonJuice = new Ingredient("Lemon Juice");


        if (ingredientRepository.count() == 0) {

            ingredientRepository.saveAll(List.of(salmon, coconutFlakes, macadamiaNuts, coconutOil));


        }
        //Ingredients for meal 1
        List<Ingredient> meal1Ingredients = new ArrayList<>();
        meal1Ingredients.add(salmon);
        meal1Ingredients.add(coconutFlakes);
        meal1Ingredients.add(coconutOil);
        meal1Ingredients.add(macadamiaNuts);


//        Recipe meal1Recipe = new Recipe(meal1, "Preheat oven to 425°F. Line a baking sheet with foil and spray with cooking spray.\n" +
//                "Place salmon fillets on the baking sheet and brush fillets with oil (either olive oil or a bit of extra melted coconut oil). Season salmon fillets with salt and pepper.\n" +
//                "Whiz macadamia nuts and coconut flakes in a food processor to break them into smaller pieces. Add to a bowl with the panko and stir to combine. Pour in 2 tbsp melted coconut oil and stir until combined and everything is moistened evenly.\n" +
//                "If salmon fillets are thicker (1 1/2\"):\n" +
//                "Place salmon in the oven and bake for 6 minutes. Thicker salmon needs a head start on cooking before adding the topping. Once the 6 minutes are up, remove from the oven and continue on with the next step.\n" +
//                "If salmon fillets are thinner (1\"):\n" +
//                "Press the macadamia/coconut mixture onto the tops of the fillets and squeeze the lemon juice over both. Place the salmon in the oven and bake for 12-15 minutes, or until salmon reaches your preferred doneness or is 145° in the thickest part. Let salmon sit for a few minutes before serving.\n" +
//                "Serve with additional lemon wedges to squeeze over top if desired.\n");

        Meal meal1 = new Meal("Coconut Macadamia Crusted Salmon",  "Oven baked Salmon crusted with cocnut flakes and crushed macadamia nuts.", meal1Ingredients);

        if (mealRepository.count() == 0) {
            mealRepository.save(meal1);

        }
        System.out.println(mealRepository.count());

    }
}


