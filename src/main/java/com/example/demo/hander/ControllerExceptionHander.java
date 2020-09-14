package com.example.demo.hander;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 创作： 承亚林
 * 时间: 2020-09-07-18:43
 */

/**
 * 异常拦截器
 */
@ControllerAdvice
public class ControllerExceptionHander {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler({Exception.class,IllegalArgumentException.class})
    public ModelAndView exceptionHandler(HttpServletRequest request, Exception e) throws Exception {
        logger.error("Requst URl:{},Exception:{}", request.getRequestURI(), e);

        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            throw e;
        }

        ModelAndView view = new ModelAndView();
        view.addObject("url", request.getRequestURI());
        view.addObject("exception", e);
        view.setViewName("error/error");
        return view;

    }
}
