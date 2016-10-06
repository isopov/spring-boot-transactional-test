package com.sopovs.moradanen.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbService {
	private final DataSource ds;

	@Autowired
	public DbService(DataSource ds) {
		this.ds = ds;
	}

	public void foo() {
		try (Connection con = ds.getConnection();
				PreparedStatement pst = con.prepareStatement("insert into foobar(val) values(?)")) {
			pst.setString(1, "foobar");
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
