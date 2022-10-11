package com.example.movieinfoservice.controllers;

import com.example.movieinfoservice.models.MovieItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/info")
public class MovieResource {
    @RequestMapping("/{movieId}")
    public MovieItem getMovie(@PathVariable("movieId") String movieId){
        return new MovieItem(movieId, "Impossible Ways");
    }
    /*public List<MovieItem>getMovies(){
        return Collections.singletonList(
                new MovieItem("Milking Hynena","2")
        );
    }*/
}
