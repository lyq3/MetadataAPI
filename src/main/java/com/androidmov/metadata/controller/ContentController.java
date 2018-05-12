package com.androidmov.metadata.controller;

import com.androidmov.metadata.common.BackData;
import com.androidmov.metadata.entity.po.Content;
import com.androidmov.metadata.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: Contents内容 Controller类
 * @author: 卡卢比
 * @date: 2018-05-12 16:56
 **/
@RestController
@RequestMapping("/contents")
public class ContentController {
    @Autowired
    private ContentService contentService;

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public BackData<Content> findById(@PathVariable("id") String id){
        Content content = contentService.findById(id);
        return new BackData<Content>().setData(content);
    }
    @GetMapping("/findAll")
    public BackData<List<Content>> findAll(){
        List<Content> list = contentService.findAll();
        return new BackData<List<Content>>().setData(list);
    }
}
