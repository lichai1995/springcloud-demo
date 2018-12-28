package com.lic.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lichai
 * @description
 * @date 18:15 2018/12/27
 */
public class PreRequestLogFilter extends ZuulFilter{

    private static final Logger LOGGER = LoggerFactory.getLogger(PreRequestLogFilter.class);

    /**
     * 过滤器的类型 pre route post error
     * @return String
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 返回一个Int值来指定过滤器的执行顺序，不同过滤器可以允许返回相同的数字
     * @return int
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 判断过滤器是否要执行
     * @return boolean
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        PreRequestLogFilter.LOGGER.info(String.format("send %s request to %s",request.getMethod(),request.getRequestURL().toString()));
        return null;
    }
}
