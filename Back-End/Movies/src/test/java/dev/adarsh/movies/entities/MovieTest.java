package dev.adarsh.movies.entities;

import org.bson.types.ObjectId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

class MovieTest {

    private static Movie movie = null;
    private static final ObjectId objectId = new ObjectId();

    @BeforeAll
    public static void setup() {
        movie = new Movie(objectId,
                "1",
                "1",
                "1",
                "1",
                "1",
                List.of("a", "b"),
                List.of("a", "b"),
                List.of(new Review(objectId, "Something"))
        );
    }

    @Test
    void getImdbId() {
        Assertions.assertEquals("1", movie.getImdbId());
    }

    @Test
    void getTitle() {
        Assertions.assertEquals("1", movie.getTitle());
    }

    @Test
    void getReleaseDate() {
        Assertions.assertEquals("1", movie.getReleaseDate());
    }

    @Test
    void getTrailerLink() {
        Assertions.assertEquals("1", movie.getTrailerLink());
    }

    @Test
    void getPoster() {
        Assertions.assertEquals("1", movie.getPoster());
    }

    @Test
    void getReviewIds() {
        Assertions.assertEquals("Something", movie.getReviewIds().get(0).getBody());
        Assertions.assertEquals(objectId, movie.getReviewIds().get(0).getObjectId());
    }
}