package com.example.booksapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public class BookDTO {

    private Long id;

    @NotBlank(message = "Título é obrigatório")
    private String title;

    @NotBlank(message = "Autor é obrigatório")
    private String author;

    @NotBlank(message = "ISBN é obrigatório")
    private String isbn;

    private String genre;

    @NotNull(message = "Data de publicação é obrigatória")
    private LocalDate publishedAt;

    @Positive(message = "Preço deve ser positivo")
    private Double price;

    public BookDTO() {}

    public BookDTO(Long id, String title, String author, String isbn, String genre, LocalDate publishedAt, Double price) {
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