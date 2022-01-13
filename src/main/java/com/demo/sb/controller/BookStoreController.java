package com.demo.sb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.sb.entity.BookDTO;

@RestController
@RequestMapping("/api/v1")
public class BookStoreController {

	@GetMapping("/books")
	public ResponseEntity<List<BookDTO>> getBooks() {
		BookDTO book1 = BookDTO.builder().title("My First Book").build();
		BookDTO book2 = BookDTO.builder().title("My Second Book").build();
		BookDTO book3 = BookDTO.builder().title("My Third Book").build();
		List<BookDTO> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		return ResponseEntity.ok(books);
	}
}
