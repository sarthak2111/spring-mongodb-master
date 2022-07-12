package com.spring.mongo.api.resource;

import com.spring.mongo.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/webApp")
public class BookWebController {
    @Autowired
    BookRepository repository;

    @GetMapping("/findAllBooks")
    public String getBooksInHtml(ModelMap model) {
        model.addAttribute("bookList",repository.findAll());
        return "form";
    }

    // TODO: Add book action html to be added
}
