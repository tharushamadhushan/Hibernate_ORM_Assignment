package example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Author {
    @Id
    private String id;
    private String name;
    private String country;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public Author(){}

    public Author(String id, String name, String country, List<Book> books) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.books = books;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


}
