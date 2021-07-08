package com.paulina.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.paulina.mvc.models.Book;
import com.paulina.mvc.repositories.BookRepository;

@Service
public class BookService {
    //Agregando el book al repositorio como una dependencia
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    //Devolviendo todos los libros.
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    //Creando un libro.
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    
    //Update un libro
    public Book updateBook(Book b) {
	return bookRepository.save(b);   	
    }
    //Obteniendo la información de un libro
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    public void deleteBook(Book b) {
	bookRepository.deleteById(b.getId());
	
    }

}