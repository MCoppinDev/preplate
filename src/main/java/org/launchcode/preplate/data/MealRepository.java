package org.launchcode.preplate.data;


import org.launchcode.preplate.models.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends CrudRepository<Meal,Integer> {




}
