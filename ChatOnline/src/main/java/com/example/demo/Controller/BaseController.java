package com.example.demo.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.core.constants.Constants;
import com.example.demo.core.model.R;

/**
 * Controller 基类
 * @author 赵家乐
 * @date 2020/02/15 16:36
 */
public class BaseController {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected HttpServletResponse response;


    /**
     * The Global exception handler
     * @param e
     * @return
     * @author 赵家乐
     * @date 2020/02/15 16:36
     */
    @ExceptionHandler(Exception.class)
    public R exceptionHandler(Exception e) {
        log.error(e.getMessage(), e);
        R response = R.failure(Constants.Response.FAILURE);
        return response;
    }

}