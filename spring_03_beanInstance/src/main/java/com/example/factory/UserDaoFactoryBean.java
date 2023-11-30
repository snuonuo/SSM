package com.example.factory;

import com.example.dao.UserDao;
import com.example.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;
//FactoryBean创建对象
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始实例工厂中创建对象的方法
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    public Class<?> getObjectType() {
        return UserDao.class;
    }


    // 接口默认方法 可以不用实现
    // 表明构造的bean是否是单例的
    public boolean isSingleton() {
        return true;
    }


}
