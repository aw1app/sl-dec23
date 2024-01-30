//package com.ecommerce.repositry;
package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EProductRepositry extends JpaRepository<EProduct, Long> {

	List<EProduct> findAllByName(String name);

	List<EProduct> findAllByPrice(BigDecimal price);

	// search by name like
	List<EProduct> findAllByNameContaining(String name);
	
	List<EProduct> findAllByPriceGreaterThan(BigDecimal price);
	
	List<EProduct> findAllByPriceGreaterThanAndPriceLessThan(BigDecimal price1, BigDecimal price2);
	
	List<EProduct> findAllByNameContainingAndPriceLessThan(String name, BigDecimal price);
	
	
	//Ordering
    List<EProduct> findAllByPriceGreaterThanOrderByPrice(BigDecimal price);
    
    // SQL queries (Native Queries)
    // Below SQL will search all products that start with name
    @Query(value="SELECT * FROM eproduct WHERE name LIKE :name%", nativeQuery=true)
    List<EProduct> abc(String name);
	
    
   

}


