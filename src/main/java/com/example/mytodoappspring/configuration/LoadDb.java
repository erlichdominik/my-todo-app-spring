package com.example.mytodoappspring.configuration;

import com.example.mytodoappspring.models.ToDoItem;
import com.example.mytodoappspring.repositories.ToDoItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDb {
    private static final Logger log = LoggerFactory.getLogger(LoadDb.class);

    @Bean
    CommandLineRunner initDb(ToDoItemRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new ToDoItem("Sample todo description")));
            log.info("Preloading " + repository.save(new ToDoItem("Some other description")));
        };
    }

}
