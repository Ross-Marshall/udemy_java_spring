package com.caveofprogramming.spring.udemy.tutorial;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class OffersDAO {
	
	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new JdbcTemplate(jdbc);
	}

	private JdbcTemplate jdbc;
	
	public List <Offer> getOffers() {
		return null;
		
	}

}
