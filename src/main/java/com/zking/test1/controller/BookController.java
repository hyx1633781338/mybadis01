package com.zking.test1.controller;

import com.zking.test1.model.Book;
import com.zking.test1.service.IBookService;
import com.zking.test1.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/bk")
public class BookController {

    @Autowired
    private IBookService bookService;

    @ModelAttribute
    public void init(Model model) {
//        System.out.println("init...");
        //用来初始化数据
        Book book = new Book();
        model.addAttribute("book", book);
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Book book) {
        Book b = bookService.load(book);
        model.addAttribute("book", b);
        return "editBook";
    }

    @RequestMapping("/toAdd")
    public String toAdd(Model model,Book book) {
        return "addBook";
    }

    @RequestMapping("/add")
    @ResponseBody
    public JsonData add(Model model,@Validated(Book.ValidateGroups.Add.class) Book book,BindingResult bindingResult) {
        JsonData jsonData = new JsonData();
        System.out.println("add");
        System.out.println(book);
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            Map<String, String> errors = new HashMap<String, String>();
            for (FieldError e : fieldErrors) {
                String field = e.getField();
                String message = e.getDefaultMessage();
//                System.out.println(field+","+message);
                errors.put(field, message);
            }
            jsonData.setCode(-1);
            jsonData.put("errors", errors);
            System.out.println(errors);
            System.out.println("验证不通过");
        }else{
            System.out.println("验证通过,新增");
        }


        //bookService.add(book);

//        return "redirect:/bk/toAdd";
        return jsonData;
    }

    @RequestMapping("/edit")
    public String edit(Model model,@Validated(Book.ValidateGroups.Edit.class) Book book,BindingResult bindingResult) {
        JsonData jsonData = new JsonData();
        System.out.println("edit");
        if (bindingResult.hasErrors()) {
            System.out.println("修改验证不通过");
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            Map<String, String> errors = new HashMap<String, String>();
            for (FieldError e : fieldErrors) {
                String field = e.getField();
                String message = e.getDefaultMessage();
//                System.out.println(field+","+message);
                errors.put(field, message);
            }
            jsonData.setCode(-1);
            jsonData.put("errors", errors);
            System.out.println(errors);
        }else{
            System.out.println("验证通过,修改");
        }

        return "redirect:/bk/toEdit";
    }

    @RequestMapping("/load/{bookId}")
    public String load(@PathVariable Integer bookId) {
        System.out.println("load:"+bookId);
        return null;
    }
}
