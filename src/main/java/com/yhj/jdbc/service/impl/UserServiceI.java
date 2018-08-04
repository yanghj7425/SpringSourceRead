package com.yhj.jdbc.service.impl;

import com.yhj.jdbc.entity.User;
import com.yhj.jdbc.mapper.UserRowMapper;
import com.yhj.jdbc.service.UserService;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

public class UserServiceI implements UserService {

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<User> queryAllUser() {
		return jdbcTemplate.query("SELECT employeeid, username FROM user", new UserRowMapper());
	}

	@Override
	public void save(User user) {
		try {
			jdbcTemplate.update("INSERT INTO user(employeeid,username) VALUES (?,?)", new Object[]{user.getEmployeeid(), user.getUsername()}, new int[]{Types.VARCHAR, Types.VARCHAR});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
