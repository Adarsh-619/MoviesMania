package dev.adarsh.movies.services;

import dev.adarsh.movies.entities.Movie;
import dev.adarsh.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    // Get all movies
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    // Get movie by id
    public Optional<Movie> getMovieById(String id) {
        return movieRepository.findMovieByImdbId(id);
    }
}
