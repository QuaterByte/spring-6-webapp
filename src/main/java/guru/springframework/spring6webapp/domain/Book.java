package guru.springframework.spring6webapp.domain;

import jakarta.persistence.Entity;

@Entity
public class Book {

    private Long id;
    private String title;
    private String isbn;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
