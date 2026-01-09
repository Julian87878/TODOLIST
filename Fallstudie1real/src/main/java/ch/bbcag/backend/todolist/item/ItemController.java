package ch.bbcag.backend.todolist.item;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/{id}")
    public Item findById(@PathVariable Integer id) {
        return itemRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    @PostMapping
    public Item insert(@RequestBody Item item ){
        return itemRepository.save(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        itemRepository.deleteById(id);
    }

    @GetMapping
    public List<Item> findItems(@RequestParam(required = false) String name) {
        if (name != null && !name.isBlank()) {
            return itemRepository.findByName(name);
        }
        return itemRepository.findAll();
    }
}
