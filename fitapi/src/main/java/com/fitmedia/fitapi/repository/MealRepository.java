package com.fitmedia.fitapi.repository;

import com.fitmedia.fitapi.model.Meal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MealRepository extends MongoRepository<Meal, String> {
}