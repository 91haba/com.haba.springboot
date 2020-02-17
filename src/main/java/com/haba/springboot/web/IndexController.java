package com.haba.springboot.web;

import com.haba.springboot.domain.user.User;
import com.haba.springboot.service.posts.PostsService;
import com.haba.springboot.web.dto.PostsResponseDto;
import com.haba.springboot.config.auth.dto.SessionUser;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model) {
        //는 index.mustache 를 반환
        model.addAttribute("posts", postsService.findAllDesc());
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        if(user != null) {
            model.addAttribute("userName", user.getName());
        }
        return "index";
    }

    // index.mustache 와 마찬가지로 /posts 를 호출하면, posts-save.mustache를 호출하는 메소드 추가
    // 파일의 위치는 index.mustache와 같습니다.
    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);
        return "post-update";
    }
}
