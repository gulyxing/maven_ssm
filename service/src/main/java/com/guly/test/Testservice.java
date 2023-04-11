package com.guly.test;

import com.guly.dao.userMapper;
import com.guly.pojo.User;
import com.guly.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-*.xml")
public class Testservice {

    @Autowired
    private UserService us;

    @Test
    public void test01(){
        System.out.println(us.find(1));
    }
}
