package dev.adarsh.movies.controllers;

import dev.adarsh.movies.entities.Movie;
import dev.adarsh.movies.services.MovieService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class MovieControllerTest {
    @Autowired
    private MovieController movieController;

    @Mock
    private MovieService movieService;

    @Test
    void contextLoads() throws Exception {
        Assertions.assertNotNull(movieController);
    }

    @Test
    public void getStatusShouldReturnAPositiveResponse() {
        Assertions.assertEquals(new ResponseEntity<String>("Status is OK!!!", HttpStatus.OK), movieController.status());
    }

    @Test
    public void getListOfMoviesWhengetMoviesIsCalled() {
        Mockito.when(movieService.getMovies()).thenReturn(List.of(new Movie()));
        Assertions.assertEquals(HttpStatus.OK, movieController.getMovies().getStatusCode());
    }

    @Test
    public void getAParticularMovieWhengetMovieByIdIsCalled() {
        Mockito.when(movieService.getMovieById("123")).thenReturn(Optional.of(new Movie()));
        Assertions.assertEquals(HttpStatus.OK, movieController.getMovieById("123").getStatusCode());
    }

}