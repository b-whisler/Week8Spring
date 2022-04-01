/**
 * @author Benjamin Whisler - bwhisler1
 * CIS175 - Spring 2022
 * Mar 30, 2022
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Car;
import dmacc.beans.Dealership;
import dmacc.repository.CarRepository;
import dmacc.repository.DealershipRepository;

@Controller
public class WebController {
	@Autowired
	CarRepository carRepo;
	@Autowired
	DealershipRepository dealerRepo;	
	
	@GetMapping("/viewinventory")
	public String viewInventory(Model model) {
		model.addAttribute("cars", carRepo.findAll());
		return "inventory";				
	}
	
	@GetMapping("/addCar")
	public String addCar(Model model) {
		Car c = new Car();
		model.addAttribute("newCar", c);
		return "car-input";
	}
	
	@GetMapping("/edit-car/{id}")
	public String editCar(@PathVariable("id") long id, Model model) {
		Car c = carRepo.findById(id).orElse(null);
		model.addAttribute("newCar", c);
		return "car-input";
	}

	@PostMapping("/update-car/{id}")
	public String updateDealership(Car c, Model model) {
		carRepo.save(c);
		return viewInventory(model);
	}
	
	@GetMapping("/delete-car/{id}")
	public String deleteCar(@PathVariable("id") long id, Model model) {
		Car c = carRepo.findById(id).orElse(null);
		carRepo.delete(c);
		return viewInventory(model);
	}
	
	
	
	
	
	

	@GetMapping("/viewdealerships")
	public String viewDealerships(Model model) {
		model.addAttribute("dealers", dealerRepo.findAll());
		return "dealerships";				
	}
	
	@GetMapping("/addDealership")
	public String addDealership(Model model) {
		Dealership d = new Dealership();
		model.addAttribute("newDealership", d);
		return "dealership-input";
	}
	
	@GetMapping("/edit-dealership/{id}")
	public String editDealership(@PathVariable("id") long id, Model model) {
		Dealership d = dealerRepo.findById(id).orElse(null);
		model.addAttribute("newDealership", d);
		return "dealership-input";
	}

	@PostMapping("/update-dealership/{id}")
	public String updateDealership(Dealership d, Model model) {
		dealerRepo.save(d);
		return viewDealerships(model);
	}
	
	@GetMapping("/delete-dealership/{id}")
	public String deleteDealership(@PathVariable("id") long id, Model model) {
		Dealership d = dealerRepo.findById(id).orElse(null);
		dealerRepo.delete(d);
		return viewDealerships(model);
	}
	
}
