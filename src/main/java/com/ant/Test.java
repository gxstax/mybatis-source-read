package com.ant;

import com.ant.conf.AppConfig;
import com.ant.dao.UserMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Test
 * @Description Test
 * @Author Ant
 * @Date 2019-03-20 23:25
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserMapper userMapper = applicationContext.getBean(UserMapper.class);

        System.out.println(userMapper.query());
        System.out.println(userMapper.query());

    }

}
