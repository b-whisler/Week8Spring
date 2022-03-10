/**
 * @author Benjamin Whisler - bwhisler1
 * CIS175 - Spring 2022
 * Mar 9, 2022
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Car;

@Configuration
public class BeanConfiguration {
	@Bean
	public Car car() {
		Car bean = new Car();
		bean.setMake("Honda");
		bean.setModel("Fit");
		bean.setYear(2010);
		bean.setMpg(20.5);
		bean.setMileage(100000);
		return bean;
	}

}
