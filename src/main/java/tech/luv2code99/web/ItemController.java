package tech.luv2code99.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import tech.luv2code99.dao.model.Item;
import tech.luv2code99.dao.model.ItemRepository;
import tech.luv2code99.web.errors.ItemNotFoundException;



@RestController
public class ItemController {

	@Autowired
	ItemRepository itemRepository;

	@GetMapping("/items")
	List<Item> all() {
		return itemRepository.findAll();
	}
	
	@GetMapping("/home")
	public String index() {
		return "<h1>Spring Application is Running</h1>";
	} 

	@GetMapping("/items/{id}")
	Item getById(@PathVariable Long id) {
		return itemRepository.findById(id).orElseThrow(()->new ItemNotFoundException(id));
	}

	@PostMapping("/items")
	Item createNewItem(@Valid @RequestBody Item newItem) {
		return itemRepository.save(newItem);
	}

	@DeleteMapping("/items/{id}")
	void delete(@PathVariable Long id) {
		itemRepository.deleteById(id);
	}

	@PutMapping("/items/{id}")
	Item updateOrCreate(@RequestBody Item newItem, @PathVariable Long id) {
		return itemRepository.findById(id).map((item) -> {
			item.setName(newItem.getName());
			return itemRepository.save(newItem);
		}).orElseGet(() -> {
			newItem.setId(id);
			return itemRepository.save(newItem);
		});
	}

}
