package com.example.booksapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Título é obrigatório")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "Autor é obrigatório")
    @Column(nullable = false)
    private String author;

    @NotBlank(message = "ISBN é obrigatório")
    @Column(unique = true, nullable = false)
    private String isbn;

    private String genre;

    @NotNull(message = "Ano de publicação é obrigatório")
    private LocalDate publishedAt;

    @Positive(message = "Preço deve ser positivo")
    private Double price;

    public Book() {}

    public Book(Long id, String title, String author, String isbn, String genre, LocalDate publishedAt, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.publishedAt = publishedAt;
        this.price = price;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public LocalDate getPublishedAt() { return publishedAt; }
    public void setPublishedAt(LocalDate publishedAt) { this.publishedAt = publishedAt; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}