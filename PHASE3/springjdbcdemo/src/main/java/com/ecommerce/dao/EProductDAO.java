package com.ecommerce.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ecommerce.EProduct;

//import com.ecommerce.EProduct;

public class EProductDAO {

	@Autowired
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	// Business method
	// 1. Fetch product objects from the DB

	public List<EProduct> getProducts() {
		return template.query("SELECT * FROM eproduct", new EProductRowMapper());
	}

}

class EProductRowMapper implements RowMapper<EProduct> {

	@Override
	public EProduct mapRow(ResultSet rs, int rowNum) throws SQLException {

		EProduct eProduct = new EProduct();

		eProduct.setID(rs.getInt(1));
		eProduct.setName(rs.getString(2));
		eProduct.setPrice(rs.getBigDecimal(3));
		eProduct.setDateAdded(rs.getDate(4));

		return eProduct;
	}

}
