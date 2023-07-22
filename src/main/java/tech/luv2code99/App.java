package tech.luv2code99;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tech.luv2code99.dao.model.Item;
import tech.luv2code99.dao.model.ItemRepository;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("Starting Spring Boot App!");
		SpringApplication.run(App.class, args);
	}

	@Autowired
    ItemRepository itemRepository;
	
	@Override
	public void run(String... args) throws Exception {
		itemRepository.save(new Item(null, "Item 1"));
		itemRepository.save(new Item(null, "Item 2"));
	}
    
    
    
    
}
