package com.codeusingjava;

import com.codeusingjava.model.Shopping;
import com.codeusingjava.repo.ShoppingDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
public class RedisDatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisDatabaseApplication.class, args);
    }

}
