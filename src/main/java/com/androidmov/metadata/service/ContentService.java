package com.androidmov.metadata.service;

import com.androidmov.metadata.entity.po.Content;

import java.util.List;

/**
 * @description: contents表Service
 * @author: 卡卢比
 * @date: 2018-05-12 16:45
 **/
public interface ContentService {
    /**
     * 根据MongoId查询内容
     * @param mongo_id
     * @return
     */
    Content findById(String mongo_id);
}
