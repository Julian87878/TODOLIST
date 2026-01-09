package ch.bbcag.backend.todolist.item;

import ch.bbcag.backend.todolist.person.Person;
import jakarta.persistence.*;
import jdk.jfr.Category;
import jdk.jfr.Name;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Item {
    @Id

    private Integer id;

    private String name;

    private String description;

    private Boolean done;

    @Column(insertable = false)
    private LocalDateTime createdAt;


    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Boolean getDone() {
        return done;
    }
    public void setDone(Boolean done) {
        this.done = done;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
