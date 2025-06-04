package edu.icet.ecom.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "blog_posts ")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private String tags;

    private String catagory;

    @Column(name = "comments_count")
    private int  commentCount;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String imageUrl;

}
