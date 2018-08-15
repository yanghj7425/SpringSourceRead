package com.yhj.jdbc.service.impl;

import com.yhj.jdbc.service.GameService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED)
public class GameServiceI implements GameService {
    @Override
    public int queryALlGames() {
        System.out.println("queryALlGames");
        throw new RuntimeException("手动抛出的异常");
//        return 0;
    }
}
