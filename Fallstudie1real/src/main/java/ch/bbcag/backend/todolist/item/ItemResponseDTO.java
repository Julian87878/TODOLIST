package ch.bbcag.backend.todolist.item;


import jakarta.persistence.Entity;

import java.time.LocalDateTime;
import java.util.Objects;


public class ItemResponseDTO extends ItemRequestDTO{

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ItemResponseDTO that = (ItemResponseDTO) o;
        return Objects.equals(createdAt, that.createdAt) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, id);
    }
}
