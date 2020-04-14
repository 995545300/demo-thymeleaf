package com.itlong.demo01.controller;

import com.itlong.demo01.entity.UserBean;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("thymeleaf")
public class UserController {
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String indexThymeleaf(Model model){
        UserBean userBean=new UserBean();
        userBean.setUserName("汝蛋-");
        userBean.setAddress("北京");
        userBean.setAge(23);
        userBean.setGender("0");

        List<UserBean>  userList=new ArrayList<>();

        UserBean userBean1=new UserBean();
        userBean1.setUserName("汝蛋1");
        userBean1.setAddress("北京");
        userBean1.setAge(23);
        userBean1.setGender("1");

        UserBean userBean2=new UserBean();
        userBean2.setUserName("汝蛋2");
        userBean2.setAddress("上海");
        userBean2.setAge(23);
        userBean2.setGender("0");

        UserBean userBean3=new UserBean();
        userBean3.setUserName("汝蛋3");
        userBean3.setAddress("广州");
        userBean3.setAge(23);
        userBean3.setGender("0");
        userList.add(userBean1);
        userList.add(userBean2);
        userList.add(userBean3);
       model.addAttribute("userdatas",userList);
       model.addAttribute("user",userBean);
     return "user/userIndex";
    }


}
