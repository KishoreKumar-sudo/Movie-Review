//Declaring a package for self explanation
package dev.kishore.movies;

//first one is a class called Spring App contains a mtd called run to start ur application you have to call this run mtd & pass this application class to it.
//you can also pass some command line arguments.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//It's an application annotation,so annotations in java used to let the complier know about wt dz class does.

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);}
}
