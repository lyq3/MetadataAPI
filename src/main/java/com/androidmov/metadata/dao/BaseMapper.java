package com.androidmov.metadata.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.io.Serializable;

/**
 * @description: Mapper抽象类
 * @author: 卡卢比
 * @date: 2018-05-12 16:26
 **/
public abstract class BaseMapper<T> implements Serializable {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 创建对象
     * @param t
     */
    public void saveUser(T t) {
        mongoTemplate.save(t);
    }

//    /**
//     * 根据用户名查询对象
//     * @param userName
//     * @return
//     */
//    public T findUserByUserName(String userName) {
//        Query query=new Query(Criteria.where("userName").is(userName));
//        T user =  mongoTemplate.findOne(query , T.class);
//        return user;
//    }
//
//    /**
//     * 更新对象
//     * @param user
//     */
//    public void updateUser(T user) {
//        Query query=new Query(Criteria.where("id").is(user.getId()));
//        Update update= new Update().set("userName", user.getUserName()).set("passWord", user.getPassWord());
//        //更新查询返回结果集的第一条
//        mongoTemplate.updateFirst(query,update,T.class);
//        //更新查询返回结果集的所有
//        // mongoTemplate.updateMulti(query,update,UserEntity.class);
//    }
//
//    /**
//     * 删除对象
//     * @param id
//     */
//    public void deleteUserById(Long id) {
//        Query query=new Query(Criteria.where("id").is(id));
//        mongoTemplate.remove(query,T.class);
//    }
}
