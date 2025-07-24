package ketan.springboot.spring6webapp.bootstrap;

import ketan.springboot.spring6webapp.domain.Author;
import ketan.springboot.spring6webapp.domain.Book;
import ketan.springboot.spring6webapp.repositories.AuthorRepository;
import ketan.springboot.spring6webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author a1= new Author();
        a1.setFirstName("ketan");
        a1.setLastName("pawar");

        Book book1= new Book();
        book1.setTitle("java and spring boot");
        book1.setIsbn("123456");

        Author a2= new Author();
        a2.setFirstName("jay");
        a2.setLastName("pawar");

        Book book2= new Book();
        book2.setTitle("java ");
        book2.setIsbn("123457");


        Author a1Saved = authorRepository.save(a1);
        Book b1Saved = bookRepository.save(book1);

        a1Saved.getBooks().add(b1Saved);

        

        Author a2Saved = authorRepository.save(a2);
        Book b2Saved = bookRepository.save(book2);

        a2Saved.getBooks().add(b2Saved);

        authorRepository.save(a1Saved);
        authorRepository.save(a2Saved);

        System.out.println("In bootstrap");
        System.out.println("author repo count "+ authorRepository.count());
        System.out.println("book repo count "+bookRepository.count());


    }
}
