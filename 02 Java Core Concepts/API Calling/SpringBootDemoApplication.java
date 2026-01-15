package com.example.springbootdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SpringBootDemoApplication {

    public static void main(String[] args) {

        // Create RestTemplate instance
        RestTemplate restTemplate = new RestTemplate();

        // API URL
        String url = "https://jsonplaceholder.typicode.com/posts/2";

        // Make GET request (BLOCKING call)
        ResponseEntity<String> response =
                restTemplate.getForEntity(url, String.class);

        // Print response body
        System.out.println(response.getBody());
    }
}
