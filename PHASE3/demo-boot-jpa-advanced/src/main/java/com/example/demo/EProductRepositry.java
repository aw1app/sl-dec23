//package com.ecommerce.repositry;
package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EProductRepositry extends JpaRepository<EProduct, Long> {

	List<EProduct> findAllByName(String name);
	
	List<EProduct> findAllByPrice(BigDecimal price);
	
}
