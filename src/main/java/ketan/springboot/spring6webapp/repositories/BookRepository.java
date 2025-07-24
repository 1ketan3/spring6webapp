package ketan.springboot.spring6webapp.repositories;

import ketan.springboot.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
