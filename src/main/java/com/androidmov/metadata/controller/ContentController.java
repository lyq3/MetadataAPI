package com.androidmov.metadata.controller;

import com.androidmov.metadata.common.BackData;
import com.androidmov.metadata.entity.po.Content;
import com.androidmov.metadata.service.ContentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: Contents内容 Controller类
 * @author: 卡卢比
 * @date: 2018-05-12 16:56
 **/
@RestController
@RequestMapping("/content")
@Api(tags = "Contents查询接口")
public class ContentController {
    @Autowired
    private ContentService contentService;

    /**
     *根据MongoDB ID查询数据
     * @param id
     * @return
     */
    @GetMapping("/findById")
    @ApiOperation("根据ID查询Content")
    public BackData<Content> findById(@ApiParam(value = "MongoDB的ID",required = true)@RequestParam("id")String id){
        Content content = contentService.findById(id);
        return new BackData<Content>().setData(content);
    }
}
