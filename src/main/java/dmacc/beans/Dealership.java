/**
 * @author Benjamin Whisler - bwhisler1
 * CIS175 - Spring 2022
 * Mar 30, 2022
 */
package dmacc.beans;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Dealership {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String address;
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch=FetchType.EAGER, orphanRemoval=true)
	private List<Car> inventory;
	
	
	public Dealership(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
}
