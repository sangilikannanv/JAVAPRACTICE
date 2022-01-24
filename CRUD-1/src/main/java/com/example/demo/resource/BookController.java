package com.example.demo.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRespository;

@RestController
public class BookController {
	
	@Autowired
	private BookRespository repository;
	
	@PostMapping("/addBook")
	public String saveBooks(@RequestBody Book book)
	{
		repository.save(book);
		return "Save Successfully";
	}
	
	@GetMapping("/findAllBooks")
	public List<Book> getBooks()
	{
		return repository.findAll();
	}
	
	@GetMapping("/findAllBooks/{id}")
	public Optional<Book> getBook(@PathVariable int id)
	{
		return repository.findById(id);
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id)
	{
		repository.deleteById(id);
		return "book deleted with id : "+id;
	}
	@PutMapping("/updateBook")
	public String updateBook(@RequestBody Book book)
	{
		Book up=repository.findById(book.getId()).orElse(new Book());
		if(up.getId()!=0)
		{
			up.setBookName(book.getBookName());
			up.setAuthorName(book.getAuthorName());
			repository.save(up);
			return "book updated with id : "+book.getId();
		}
		else
		{
		return "Id not found ";
		}
	}

}
