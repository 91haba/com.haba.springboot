package com.haba.springboot.service.posts;

import com.haba.springboot.domain.posts.PostsRepository;
import com.haba.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto reqeustDto) {
        return postsRepository.save(reqeustDto.toEntity()).getId();
    }

}
