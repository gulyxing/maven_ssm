package com.guly.test;

import com.guly.dao.userMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-dao.xml")
public class TestDao {

    @Autowired
    private userMapper um;
    @Test
    public void test01(){

        System.out.println(um.find(1));

    }


}