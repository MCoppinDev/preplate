package org.launchcode.preplate.data;

import org.launchcode.preplate.models.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient,Integer> {

}
