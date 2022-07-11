package com.spring.mongo.api.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "Book")
public class Book {
	public int getId() {
		return id;
	}
	@Id
	private int id;

	public String getBookName() {
		return bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	private String bookName;
	private String authorName;
}
