package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import service.BookService;

import java.util.HashMap;
import java.util.Map;
//@Controller
//public class HelloController {
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
//        ModelAndView mv =new ModelAndView();
//
//        // 业务代码
//        String result =" helloSpringmvc";
//
//        mv.addObject("msg",result);
//
//        //视图跳转
//        mv.setViewName("test");
//        return mv;
//    }
//}

@Controller
public class HelloController {
    @Autowired
    public BookService bookService;
    @RequestMapping("/h1")
    public String hello(Model model){
        model.addAttribute("msg","hello,springannotation");
        return "test";
    }
    @RequestMapping("用户的个人页面")
    public void login(String loginAcc,String loginPwd){
        Map<String,Object> map=new HashMap<>();
        map.put("loginAcc",loginAcc);
        map.put("loginPwd",loginPwd);
        //bookService.addBook(map);
    }
}
