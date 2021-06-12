package com.example.DesignPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
		MallardDuck duck = new MallardDuck() ;
		duck.display();
		duck.quack() ;
		duck.swim();
		duck.fly();
		System.out.println("************");
		ReaHeadDuck rduck = new ReaHeadDuck() ;
		rduck.display();
		rduck.quack() ;
		rduck.swim();
		rduck.fly();
		System.out.println("************");
		WoodenDuck wduck = new WoodenDuck() ;
		wduck.display();
		wduck.quack() ;
		wduck.swim();
		wduck.fly();
		System.out.println("************");
		RubberDuck rubduck = new RubberDuck() ;
		rubduck.display();
		rubduck.swim();
		rubduck.fly();
		rubduck.quack();
	}

}
