package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsResponseDto {

    //private LocalDateTime createdTime; //2022.03.19 ~ 2022.03.20 뿌듯한 날^^ DB로 직접 입력하면 LocalDateTime 입력안됨. 웹에서 직접 데이터 추가해야함.
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){
        //this.createdTime = entity.getCreatedDate();
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }

}
