package com.example.demo;

import com.example.demo.model.ToDoItem;
import com.example.demo.service.ToDoItemService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.OffsetDateTime;

@SpringBootApplication
@RestController
public class MicroserviceDemoApplication {

	@Autowired
	private ToDoItemService ToDoItemService;

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDemoApplication.class, args);
	}

	@GetMapping("/function")
	public String function() {
		OffsetDateTime creation_ts = OffsetDateTime.now();
		ToDoItem td = ToDoItemService.addToDoItem(new ToDoItem(1, "desc", creation_ts, true));
		return "Hello World";
	}

}