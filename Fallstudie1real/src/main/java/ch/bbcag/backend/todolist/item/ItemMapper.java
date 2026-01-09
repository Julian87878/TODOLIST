package ch.bbcag.backend.todolist.item;

public class ItemMapper {

    public static ItemResponseDTO toResponseDTO(Item item) {
        if (item == null) {
            return null;
        }

        ItemResponseDTO dto = new ItemResponseDTO();

        dto.setName(item.getName());
        dto.setDescription(item.getDescription());
        dto.setDone(item.getDone());

        if (item.getPerson() != null) {
            dto.setPersonId(item.getPerson().getId());
        }

        dto.setId(item.getId());
        dto.setCreatedAt(item.getCreatedAt());

        return dto;
    }

    public static Item fromRequestDTO(ItemRequestDTO itemRequestDTO) {
        if (itemRequestDTO == null) {
            return null;
        }

        Item item = new Item();

        item.setName(itemRequestDTO.getName());
        item.setDescription(itemRequestDTO.getDescription());
        item.setDone(itemRequestDTO.getDone());


        return item;
    }
}
