package ch.bbcag.backend.todolist.item;

import java.util.List;
import java.util.Objects;

public class ItemRequestDTO {

    public List<Integer> tagsIds;
    public Integer personId;
    public String description;
    public Boolean done;
    public String name;

    public ItemRequestDTO() {
    }

    public ItemRequestDTO(List<Integer> tagsIds, Integer personId, String description, Boolean done) {
        this.tagsIds = tagsIds;
        this.personId = personId;
        this.description = description;
        this.done = done;
        this.name = name;
    }

    public List<Integer> getTagsIds() {
        return tagsIds;
    }
    public void setTagsIds(List<Integer> tagsIds) {
        this.tagsIds = tagsIds;
    }

    public Boolean getDone() {
        return done;
    }

    public String getName() {
        return name;
    }

    public Integer getPersonId() {
        return personId;
    }

    public String getDescription() {
        return description;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ItemRequestDTO that = (ItemRequestDTO) o;
        return Objects.equals(tagsIds, that.tagsIds) && Objects.equals(personId, that.personId) && Objects.equals(description, that.description) && Objects.equals(done, that.done) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagsIds, personId, description, done, name);
    }
}
