package edu.icet.ecom.repository;

import edu.icet.ecom.model.entity.PostEntity;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public interface PostRepository extends JpaRepository<PostEntity,Long> {


}
