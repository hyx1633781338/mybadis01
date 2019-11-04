package com.zking.test1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Controller
public class UploadController {

//    /usr/uploads
//    private String saveDir = "d:\\temp\\uploads";

    @Value("${dir}")
    private String dir;

    @GetMapping("/toUpload")
    public String toUpload() {
        return "upload";
    }

//    @PostMapping("/upload1")
//    public String upload1(MultipartFile img) throws Exception {
//        //向数据库保存一条上传数据
//
//        //想文件保存服务器的某个目录
//        System.out.println("dir =" + this.dir);
//        String fileId = this.getFileId();
//        String path = this.dir + File.separator + fileId;
//        System.out.println(path);
//
//        File file = new File(path);
//        img.transferTo(file);
//
//        return "redirect:/toUpload";
//    }

    @PostMapping("/upload2")
    public String upload1(MultipartFile[] imgs) throws Exception {
        //向数据库保存一条上传数据

        //向文件保存服务器的某个目录
        MultipartFile img = null;
        for (int i = 0 ;null!=imgs&&i<imgs.length;i++){
            img = imgs[i];
            String fileId = this.getFileId();
            String path = this.dir + File.separator + fileId;
            System.out.println(path);

            File file = new File(path);
            img.transferTo(file);
        }

        return "redirect:/toUpload";
    }

    private String getFileId() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
