package com.ecommerce.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.EducationalDegree;

@Repository
public interface EducationalDegreeRepositry extends JpaRepository<EducationalDegree, Long>{

}

