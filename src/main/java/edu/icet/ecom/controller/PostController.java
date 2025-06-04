package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.PostDto;
import edu.icet.ecom.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping
    public List<PostDto> getAll(){
        return postService.getAll();
    }

}
