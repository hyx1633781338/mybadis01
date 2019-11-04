package com.zking.test1.controller;

import com.zking.test1.model.Admin;
import com.zking.test1.service.IAdminService;
import com.zking.test1.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IAdminService iAdminService;

    private JsonData jd;

    @ModelAttribute
    public void init(Model model) {
//        System.out.println("init...");
        //用来初始化数据
        Admin admin = new Admin();
        jd = new JsonData();
       // model.addAttribute("book", book);
    }

    @RequestMapping("/toAdd")
    public String toAdd(Model model,Admin admin) {
        return "addBook";
    }

    @RequestMapping("/login")
    @ResponseBody
    public JsonData login(Model model,Admin admin) {
       Admin a=iAdminService.login(admin);
       if(null==a){
           jd.setCode(-1);
           jd.setMessage("登陆失败");
          // this.writeJson(jd);
           return jd;
       }
       else{
           jd.setCode(0);
           jd.setMessage("登陆成功");
          // this.writeJson(jd);
           return jd;
       }
    }
}
