package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Car;
import dmacc.beans.Dealership;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.CarRepository;
import dmacc.repository.DealershipRepository;

@SpringBootApplication
public class Week8SpringApplication{

	public static void main(String[] args) {
		SpringApplication.run(Week8SpringApplication.class, args);
	}
	
	@Autowired
	CarRepository repo;
	@Autowired
	DealershipRepository dealerRepo;
	
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Car c = appContext.getBean("car", Car.class);
		c.setMileage(150000);
		repo.save(c);
		
		//Dealership d1 = new Dealership("A","B");
		//dealerRepo.save(d1);
		
		Car c2 = new Car("Ford", "Mustang", 15, 2015, 30000, 10000);
		repo.save(c2);
		
		List<Car> allCars = repo.findAll();
		for(Car car : allCars) {
			System.out.println(car.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
	
}
