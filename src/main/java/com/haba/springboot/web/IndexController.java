package com.haba.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        //는 index.mustache 를 반환
        return "index";
    }

    // index.mustache 와 마찬가지로 /posts 를 호출하면, posts-save.mustache를 호출하는 메소드 추가
    // 파일의 위치는 index.mustache와 같습니다.

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }
}
