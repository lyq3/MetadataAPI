package com.androidmov.metadata.service.impl;

import com.androidmov.metadata.dao.ContentDao;
import com.androidmov.metadata.entity.po.Content;
import com.androidmov.metadata.service.ContentService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: Contents表Service实现类
 * @author: 卡卢比
 * @date: 2018-05-12 16:48
 **/
@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    private ContentDao contentDao;
    @Override
    public Content findById(String mongo_id) {
        return contentDao.findOne(new ObjectId(mongo_id));
    }
}
