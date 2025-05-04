package viana.marcio.desafios.filmesficcaocientifica.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import viana.marcio.desafios.filmesficcaocientifica.model.MovieLocation;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieLocationService {

    private final WebClient webClient;


    public MovieLocationService(WebClient.Builder webClientBuilder ) {
        this.webClient = webClientBuilder
                .baseUrl("https://data.sfgov.org/resource/yitu-d5am.json")
                .build();
    }

    public List<MovieLocation> getAllMovies() {
        return webClient.get()
                .retrieve()
                .bodyToFlux(MovieLocation.class)
                .collectList()
                .block();
    }

    public List<MovieLocation> getMoviesByTitle(String query) {
        return getAllMovies()
                .stream()
                .filter((movie -> movie.getTitle() != null && movie.getTitle().toLowerCase().contains(query.toLowerCase())))
                .collect(Collectors.toList());
    }
}
