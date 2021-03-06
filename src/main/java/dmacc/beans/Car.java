/**
 * @author Benjamin Whisler - bwhisler1
 * CIS175 - Spring 2022
 * Mar 9, 2022
 */
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue
	private int id;
	private String make;
	private String model;
	private double mpg;
	private int year;
	private int mileage;
	
	public Car() {
		
	}

	public Car(String make, String model, double mpg, int year, int mileage) {
		this.make = make;
		this.model = model;
		this.mpg = mpg;
		this.year = year;
		this.mileage = mileage;
	}

	public Car(int id, String make, String model, double mpg, int year, int mileage) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.mpg = mpg;
		this.year = year;
		this.mileage = mileage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getMpg() {
		return mpg;
	}

	public void setMpg(double mpg) {
		this.mpg = mpg;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", mpg=" + mpg + ", year=" + year
				+ ", mileage=" + mileage + "]";
	}
	
	
	
	
}
