package com.androidmov.metadata.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

/**
 * 全局的权限验证和异常拦截
 * @author 卡卢比
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger  =  LoggerFactory.getLogger(GlobalExceptionHandler. class );
    /**
     * 登录认证异常
     */
    @ExceptionHandler({ UnauthenticatedException.class, AuthenticationException.class })
    @ResponseBody
    public BackData authenticationException(WebRequest request , HttpServletResponse response, Model model) {
        return new BackData().setCode(BackStatusEnum.NO_LOGIN.getCode()).setMsg(BackStatusEnum.NO_LOGIN.getMsg());
    }

    /**
     * 权限异常
     */
    @ExceptionHandler({ UnauthorizedException.class, AuthorizationException.class })
    @ResponseBody
    public BackData authorizationException(HttpServletRequest request, HttpServletResponse response) {
        BackData res = new BackData();
        res.setCode(BackStatusEnum.NO_PERMITION.getCode()).setMsg(BackStatusEnum.NO_PERMITION.getMsg());
        return res;
    }

    /**
     * 业务异常
     */
    @ExceptionHandler(BussinessException.class)
    @ResponseBody
    public BackData bussinessException(BussinessException e) {
        BackData res = new BackData();
        res.setCode(e.getCode()).setMsg(e.getMessage());
        logger.error(ExceptionUtils.getStackTrace(e));
        return res;
    }

    /**
     * 其他未知异常
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BackData bussinessException(Exception e) {
        BackData res = new BackData();
        res.setCode(BackStatusEnum.UNKNOWN.getCode()).setMsg(BackStatusEnum.UNKNOWN.getMsg());
        logger.error(ExceptionUtils.getStackTrace(e));
        e.printStackTrace();
        return res;
    }

}
