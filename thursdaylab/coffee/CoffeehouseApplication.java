//// Define the package name for this file
package lms.coffee;

//Import required Spring Boot classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Define the main class for the Coffeehouse application
@SpringBootApplication
public class CoffeehouseApplication {

	// Main method to launch the application
	public static void main(String[] args) 
	{
		// Use SpringApplication.run() to launch the Spring Boot application
		SpringApplication.run(CoffeehouseApplication.class, args);
	}

}
