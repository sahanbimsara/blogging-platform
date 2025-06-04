package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.PostDto;
import edu.icet.ecom.model.entity.PostEntity;
import edu.icet.ecom.repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    ModelMapper modelMapper = new ModelMapper();

    public List<PostDto> getAll(){
        List<PostEntity> postEntities = postRepository.findAll();
        List<PostDto> postDtos = new ArrayList<>();

        for (PostEntity postEntity:postEntities){
            PostDto postDto = new PostDto();


//            postDto.setId(postEntity.getId());
//            postDto.setTitle(postEntity.getTitle());
//            postDto.setContent(postEntity.getContent());


            postDtos.add(postDto);
        }

        return postDtos;
    }
}
