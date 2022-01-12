package com.demp.sb.bookstore;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.sb.bookstore.BookStoreApplication;

@SpringBootTest(classes = BookStoreApplication.class)
class BookstoreApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true);
	}
}
