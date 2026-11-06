package com.fitmedia.fitapi.controller;

import com.fitmedia.fitapi.model.Meal;
import com.fitmedia.fitapi.repository.MealRepository;
import com.fitmedia.fitapi.resource.MealRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MealController {

    private final MealRepository mealRepository;

    public MealController(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @GetMapping("/meal")
    public ResponseEntity<List<Meal>> getAllMeals() {

        return ResponseEntity.ok(this.mealRepository.findAll());
    }



        @GetMapping("/meal/{id}")

            public ResponseEntity getMealById(@PathVariable String id) {

        

                Optional<Meal> meal = this.mealRepository.findById(id);

        

                if(meal.isPresent()) {

                    return ResponseEntity.ok(meal.get());

                } else {

                    return ResponseEntity.ok("The product with id: " + id + " was not found.");

                }

            }

    @PostMapping("/meal")
    public ResponseEntity<Meal> createMeal(@RequestBody MealRequest mealRequest) {

        Meal meal = new Meal();
        meal.setMealName(mealRequest.getMealName());
        meal.setNutritions(mealRequest.getNutritions());
        meal.setMealType(mealRequest.getMealType());
        meal.setMealDescription(mealRequest.getMealDescription());

        return ResponseEntity.status(201).body(this.mealRepository.save(meal));
    }

    @PutMapping("/meal/{id}")

    public ResponseEntity<?> updateMealById(@PathVariable String id, @RequestBody MealRequest updateRequest) {

        Optional<Meal> existingMeal = this.mealRepository.findById(id);

 

        if (existingMeal.isPresent()) {

            Meal meal = existingMeal.get();

            meal.setMealName(updateRequest.getMealName());
            meal.setNutritions(updateRequest.getNutritions());
            meal.setMealType(updateRequest.getMealType());
            meal.setMealDescription(updateRequest.getMealDescription());

            Meal updatedMeal = this.mealRepository.save(meal);

            return ResponseEntity.ok(updatedMeal);

        } else {

            return ResponseEntity.notFound().build();

        }

    }

 

    @DeleteMapping("/meal/{id}")

    public ResponseEntity deleteMealById(@PathVariable String id) {

 

        Optional<Meal> meal = this.mealRepository.findById(id);

 

        if(meal.isPresent()) {

            this.mealRepository.deleteById(id);

            return ResponseEntity.ok("Success.");

        } else {

            return ResponseEntity.ok("The product with id: " + id + " was not found.");

        }

    }

    
}

