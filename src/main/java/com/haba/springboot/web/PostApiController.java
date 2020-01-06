package com.haba.springboot.web;

import com.haba.springboot.service.posts.PostsService;
import com.haba.springboot.web.dto.PostsSaveRequestDto;
import com.haba.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

//    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto)

}
