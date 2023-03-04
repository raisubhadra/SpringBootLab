// Define the package name for this file
package lms.coffee.controller;

//Import required Java and Spring Boot classes
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lms.coffee.entity.Coffee;

//Define a REST controller for handling coffee requests
@RestController

public class CoffeeController 
{
	// Define a list of coffee objects
	private List<Coffee> coffee = new ArrayList<>();
	
	// Constructor to populate the coffee list
public CoffeeController() 
{
	coffee.addAll(List.of(
			
			new Coffee("Bourburn",200.30),
			new Coffee("Nescafe",100.00),
			new Coffee("Nestle",20.00),
			new Coffee("Sun",50.00),
			new Coffee("Bru",80.00)
			
			));
}
@GetMapping("/coffee")
	Iterable<Coffee> getAllCoffee(){
		return coffee;
	
    }
}

