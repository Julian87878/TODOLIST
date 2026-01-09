package ch.bbcag.backend.todolist.item;


import jakarta.persistence.Entity;

import java.time.LocalDateTime;


public class ItemResponseDTO {

    private LocalDateTime createdAt;
    private Integer id;

    public ItemResponseDTO() {
    }

    public ItemResponseDTO(LocalDateTime createdAt, Integer id) {
        this.createdAt = createdAt;
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }


}
