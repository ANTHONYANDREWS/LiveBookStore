package in.AnthonyAndrews.OnlineBookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.AnthonyAndrews.OnlineBookStore.DAO.BookRepository;
import in.AnthonyAndrews.OnlineBookStore.model.Book;

//@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/users")
public class BookController {
	@Autowired
	private BookRepository bookrepository;
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookrepository.findAll();
	}


}


