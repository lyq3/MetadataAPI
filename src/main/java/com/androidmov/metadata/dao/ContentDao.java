package com.androidmov.metadata.dao;

import com.androidmov.metadata.entity.po.Content;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @description: contents内容表操作类
 * @author: 卡卢比
 * @date: 2018-05-12 16:40
 **/
@Repository
public interface ContentDao extends MongoRepository<Content,String> {
}
