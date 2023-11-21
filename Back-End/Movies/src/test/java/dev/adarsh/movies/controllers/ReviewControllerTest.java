package dev.adarsh.movies.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class ReviewControllerTest {
    @Autowired
    private ReviewController reviewController;

    @Test
    void contextLoads() throws Exception {
        Assertions.assertNotNull(reviewController);
    }

    @Test
    void testWhethercreateReviewReturnsAHttpStatusCreatedCode() {
        Map<String, String> payload = new HashMap<>();
        payload.put("reviewBody", "Something");
        payload.put("imdbId", "12");
        Assertions.assertEquals(HttpStatus.CREATED, reviewController.createReview(payload).getStatusCode());
    }
}