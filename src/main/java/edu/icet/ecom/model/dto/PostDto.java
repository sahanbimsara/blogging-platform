package edu.icet.ecom.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PostDto {
    private Long id;

    private String title;

    private String content;

    private String tags;

    private String catagory;

    private int  commentCount;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String imageUrl;

}
