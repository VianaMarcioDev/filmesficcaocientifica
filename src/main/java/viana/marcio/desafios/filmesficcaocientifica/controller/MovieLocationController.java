package viana.marcio.desafios.filmesficcaocientifica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import viana.marcio.desafios.filmesficcaocientifica.model.MovieLocation;
import viana.marcio.desafios.filmesficcaocientifica.service.MovieLocationService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieLocationController {

    private final MovieLocationService movieLocationService;

    public MovieLocationController(MovieLocationService movieLocationService) {
        this.movieLocationService = movieLocationService;
    }

    @GetMapping
    public List<MovieLocation> getAll(@RequestParam Optional<String> title) {
        return title.map(movieLocationService::getMoviesByTitle)
                .orElseGet(movieLocationService::getAllMovies);
    }
}