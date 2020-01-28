package com.haba.springboot.web;

import com.haba.springboot.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model) {
        //는 index.mustache 를 반환
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }

    // index.mustache 와 마찬가지로 /posts 를 호출하면, posts-save.mustache를 호출하는 메소드 추가
    // 파일의 위치는 index.mustache와 같습니다.

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }
}
