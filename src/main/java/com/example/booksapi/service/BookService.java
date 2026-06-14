package com.example.booksapi.service;

import com.example.booksapi.dto.BookDTO;
import com.example.booksapi.exception.BookNotFoundException;
import com.example.booksapi.model.Book;
import com.example.booksapi.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookDTO> findAll() {
        return bookRepository.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    public BookDTO findById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Livro não encontrado com id: " + id));
        return toDTO(book);
    }

    public BookDTO create(BookDTO dto) {
        return toDTO(bookRepository.save(toEntity(dto)));
    }

    public BookDTO update(Long id, BookDTO dto) {
        Book existing = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Livro não encontrado com id: " + id));
        existing.setTitle(dto.getTitle());
        existing.setAuthor(dto.getAuthor());
        existing.setIsbn(dto.getIsbn());
        existing.setGenre(dto.getGenre());
        existing.setPublishedAt(dto.getPublishedAt());
        existing.setPrice(dto.getPrice());
        return toDTO(bookRepository.save(existing));
    }

    public void delete(Long id) {
        if (!bookRepository.existsById(id)) {
            throw new BookNotFoundException("Livro não encontrado com id: " + id);
        }
        bookRepository.deleteById(id);
    }

    public List<BookDTO> findByAuthor(String author) {
        return bookRepository.findByAuthorContainingIgnoreCase(author).stream().map(this::toDTO).collect(Collectors.toList());
    }

    public List<BookDTO> findByGenre(String genre) {
        return bookRepository.findByGenreIgnoreCase(genre).stream().map(this::toDTO).collect(Collectors.toList());
    }

    public List<BookDTO> findByTitle(String title) {
        return bookRepository.findByTitleContainingIgnoreCase(title).stream().map(this::toDTO).collect(Collectors.toList());
    }

    private BookDTO toDTO(Book book) {
        return new BookDTO(book.getId(), book.getTitle(), book.getAuthor(), book.getIsbn(), book.getGenre(), book.getPublishedAt(), book.getPrice());
    }

    private Book toEntity(BookDTO dto) {
        return new Book(null, dto.getTitle(), dto.getAuthor(), dto.getIsbn(), dto.getGenre(), dto.getPublishedAt(), dto.getPrice());
    }
}