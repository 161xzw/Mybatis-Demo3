package com.xiao.boot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;
@Slf4j
@SpringBootTest
class Boot01Web01ApplicationTests {
@Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    void contextLoads() {
        //List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from news");
        //System.out.println(list);
        Long aLong = jdbcTemplate.queryForObject("select count(*) from news", Long.class);
        log.info("总共{}",aLong);
        System.out.println(aLong);
    }

}
