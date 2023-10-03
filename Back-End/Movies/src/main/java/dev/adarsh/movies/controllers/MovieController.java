package dev.adarsh.movies.controllers;

import dev.adarsh.movies.entities.Movie;
import dev.adarsh.movies.services.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    // curl -i "http://localhost:8000/api/v1/movies/status"
    @GetMapping("/status")
    public ResponseEntity<String> status() {
        return new ResponseEntity<String>("Status is OK!!!", HttpStatus.OK);
    }

    // Get all movies
    // http://localhost:8000/api/v1/movies
    @GetMapping
    public ResponseEntity<List<Movie>> getMovies() {
        return new ResponseEntity<>(movieService.getMovies(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable("id") String imdbId) {
        return new ResponseEntity<>(movieService.getMovieById(imdbId), HttpStatus.FOUND);
    }
}
