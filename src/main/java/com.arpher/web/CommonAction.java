package com.arpher.web;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@Transactional
public class CommonAction {

    @Resource
    private SessionFactory sessionFactory;
    @RequestMapping("test")
    public void test(HttpServletResponse response){
        Session session = sessionFactory.getCurrentSession();
        SQLQuery sqlQuery = session.createSQLQuery("select * from user");
        List list = sqlQuery.list();
        System.out.printf("user表有"+list.size()+"个用户\n");
        try {
            response.setContentType("application/json");
            response.setHeader("Cache-Control", "no-cache");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("{\"msg\":\"调用成功bbbb\"}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("hello")
    public ModelAndView hello(HttpServletResponse response){
        ModelAndView mv = new ModelAndView();
        System.out.println("返回index.jsp页面ffff");
        mv.setViewName("index.jsp");
        mv.addObject("msg","返回成功");
        return mv;
    }
}
