package be.intec.lesJS.demo.repo;

import be.intec.lesJS.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
