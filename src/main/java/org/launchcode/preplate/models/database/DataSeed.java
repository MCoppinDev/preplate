package org.launchcode.preplate.models.database;

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
        Ingredient blackPepper = new Ingredient("Black Pepper");
        Ingredient beefShortRib = new Ingredient("Beef Short Rib");
        Ingredient daikonRadish = new Ingredient("Daikon Radish");
        Ingredient whiteOnion = new Ingredient("White Onion");
        Ingredient carrot = new Ingredient("Carrot");
        Ingredient pear  = new Ingredient("Pear");
        Ingredient beefBroth = new Ingredient("Beef Bone Broth");
        Ingredient cocoAminos = new Ingredient("Coconut Aminos");
        Ingredient greenOnions = new Ingredient("Green Onions");
        Ingredient garlic = new Ingredient("Garlic Cloves");
        Ingredient ginger = new Ingredient("Ginger");
        Ingredient fishSauce = new Ingredient("Fish Sauce");
        Ingredient appleVinegar = new Ingredient("Apple Cider Vinegar");
        Ingredient lemonJuice = new Ingredient("Lemon Juice");
        Ingredient soySauce = new Ingredient("Soy Sauce");
        Ingredient tapiocaFlour = new Ingredient("Tapioca Flour");
        Ingredient chickenBroth  = new Ingredient("Chicken Bone Broth");
        Ingredient coconutMilk = new Ingredient("Full Fat Coconut Milk");
        Ingredient ghee = new Ingredient("Ghee (Clarified Butter)");
        Ingredient dijonMustard = new Ingredient("Dijon Mustard");
        Ingredient sundriedTomatoes = new Ingredient("Sun-Dried Tomatoes");
        Ingredient babySpinach = new Ingredient("Baby Spinach");
        Ingredient parsley = new Ingredient("Parsley");
        Ingredient italianSeasoning  = new Ingredient("Italian Seasoning Blend");
        Ingredient shrimp = new Ingredient("Shrimp");
        Ingredient avocadoOil = new Ingredient("Avocado Oil");
        Ingredient nutritionalYeast = new Ingredient("Nutritional Yeast");
//        Ingredient  = new Ingredient("");
//        Ingredient  = new Ingredient("");
//        Ingredient  = new Ingredient("");
//        Ingredient  = new Ingredient("");
//        Ingredient  = new Ingredient("");
//        Ingredient  = new Ingredient("");



        if (ingredientRepository.count() == 0) {

            ingredientRepository.saveAll(List.of(
                    salmon,
                    coconutFlakes,
                    macadamiaNuts,
                    coconutOil,seaSalt,
                    blackPepper,
                    beefShortRib,
                    daikonRadish,
                    whiteOnion,
                    carrot,
                    lemonJuice,
                    pear,
                    beefBroth,
                    cocoAminos,
                    greenOnions,
                    garlic,
                    ginger,
                    fishSauce,
                    appleVinegar,
                    lemonJuice,
                    soySauce,
                    tapiocaFlour,
                    chickenBroth,
                    coconutMilk,
                    ghee,
                    dijonMustard,
                    sundriedTomatoes,
                    babySpinach,
                    parsley,
                    italianSeasoning,
                    shrimp,
                    avocadoOil,
                    nutritionalYeast
            ));


        }

//        List<Ingredient> mealIngredients = new ArrayList<>();
//        mealIngredients.add();
//        mealIngredients.add();
//        mealIngredients.add();
//        mealIngredients.add();
        //Ingredients for meal 1
        List<Ingredient> meal1Ingredients = new ArrayList<>();
        meal1Ingredients.add(salmon);
        meal1Ingredients.add(coconutFlakes);
        meal1Ingredients.add(coconutOil);
        meal1Ingredients.add(macadamiaNuts);

        //meal2
        List<Ingredient> meal2Ingredients = new ArrayList<>();
        meal2Ingredients.add(beefShortRib);
        meal2Ingredients.add(daikonRadish);
        meal2Ingredients.add(carrot);
        meal2Ingredients.add(whiteOnion);
        meal2Ingredients.add(greenOnions);
        meal2Ingredients.add(seaSalt);
        meal2Ingredients.add(blackPepper);
        meal2Ingredients.add(pear);
        meal2Ingredients.add(beefBroth);
        meal2Ingredients.add(fishSauce);
        meal2Ingredients.add(coconutFlakes);
        meal2Ingredients.add(appleVinegar);
        meal2Ingredients.add(garlic);
        meal2Ingredients.add(soySauce);

        //meal3
        List<Ingredient> meal3Ingredients = new ArrayList<>();
        meal3Ingredients.add(shrimp);
        meal3Ingredients.add(ghee);
        meal3Ingredients.add(whiteOnion);
        meal3Ingredients.add(garlic);
        meal3Ingredients.add(tapiocaFlour);
        meal3Ingredients.add(chickenBroth);
        meal3Ingredients.add(coconutMilk);
        meal3Ingredients.add(italianSeasoning);
        meal3Ingredients.add(dijonMustard);
        meal3Ingredients.add(nutritionalYeast);
        meal3Ingredients.add(sundriedTomatoes);
        meal3Ingredients.add(blackPepper);
        meal3Ingredients.add(babySpinach);
        meal3Ingredients.add(parsley);




//        Recipe meal1Recipe = new Recipe(meal1, "Preheat oven to 425°F. Line a baking sheet with foil and spray with cooking spray.\n" +
//                "Place salmon fillets on the baking sheet and brush fillets with oil (either olive oil or a bit of extra melted coconut oil). Season salmon fillets with salt and blackPepper.\n" +
//                "Whiz macadamia nuts and coconut flakes in a food processor to break them into smaller pieces. Add to a bowl with the panko and stir to combine. Pour in 2 tbsp melted coconut oil and stir until combined and everything is moistened evenly.\n" +
//                "If salmon fillets are thicker (1 1/2\"):\n" +
//                "Place salmon in the oven and bake for 6 minutes. Thicker salmon needs a head start on cooking before adding the topping. Once the 6 minutes are up, remove from the oven and continue on with the next step.\n" +
//                "If salmon fillets are thinner (1\"):\n" +
//                "Press the macadamia/coconut mixture onto the tops of the fillets and squeeze the lemon juice over both. Place the salmon in the oven and bake for 12-15 minutes, or until salmon reaches your preferred doneness or is 145° in the thickest part. Let salmon sit for a few minutes before serving.\n" +
//                "Serve with additional lemon wedges to squeeze over top if desired.\n");
//        Meal  = new Meal();
        Meal meal1 = new Meal("Coconut Macadamia Crusted Salmon",  "Oven baked Salmon crusted with cocnut flakes and crushed macadamia nuts.", meal1Ingredients);
        Meal meal2 = new Meal("Braised Beef Short Rib Stew", "A korean style beef short rib stew",meal2Ingredients);
        Meal meal3 = new Meal("Garlic Tuscan Shrimp Skillet", "Shrimp skillet cooked with fresh green spinach and sun-dried tomatoes", meal3Ingredients);



        if (mealRepository.count() == 0) {
            mealRepository.saveAll(List.of(meal1,meal2,meal3));

        }
        System.out.println(mealRepository.count());

    }
}


