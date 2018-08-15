package com.yhj.jdbc.service.impl;

import com.yhj.jdbc.entity.User;
import com.yhj.jdbc.mapper.UserRowMapper;
import com.yhj.jdbc.service.GameService;
import com.yhj.jdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceI implements UserService {

    private JdbcTemplate jdbcTemplate;

    private GameService gameService;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public void setGameService(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public List<User> queryAllUser() {
        return jdbcTemplate.query("SELECT studentname, studentnumber FROM user", new UserRowMapper());
    }

    @Override
    public void save(User user) {
       try {
           gameService.queryALlGames();
       }catch (Exception e){
           e.printStackTrace();
       }

        jdbcTemplate.update("INSERT INTO user(studentname,studentnumber) VALUES (?,?)", new Object[]{user.getEmployeeid(), user.getUsername()}, new int[]{Types.VARCHAR, Types.VARCHAR});
    }
}
