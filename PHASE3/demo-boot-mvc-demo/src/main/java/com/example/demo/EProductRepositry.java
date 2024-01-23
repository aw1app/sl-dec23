//package com.ecommerce.repositry;
package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EProductRepositry extends JpaRepository<EProduct, Long> {

}
