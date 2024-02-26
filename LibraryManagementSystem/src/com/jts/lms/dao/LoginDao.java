package com.jts.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

	public String doLogin(Connection conn, String userName, String password) throws SQLException {
		String query = "select * from login where user_name = ? and password = ?";

		try (PreparedStatement ps = conn.prepareStatement(query)) {
			ps.setString(1, userName);
			ps.setString(2, password);

			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					return rs.getString("user_type");
				}
			}
		}

		return null;
	}
}
