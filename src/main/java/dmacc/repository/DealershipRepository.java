/**
 * @author Benjamin Whisler - bwhisler1
 * CIS175 - Spring 2022
 * Mar 30, 2022
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Dealership;

public interface DealershipRepository extends JpaRepository<Dealership, Long>  {

}
