package ketan.springboot.spring6webapp.repositories;

import ketan.springboot.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
