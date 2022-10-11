package com.example.moviratingsservice.controllers;

import com.example.moviratingsservice.models.Rating;
import com.example.moviratingsservice.models.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/rating")
public class RatingResource {
    @GetMapping("/{movieId}")
    public Rating getSpecificMovieRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 4);
    }
    //to return ratings of movies of specific user of userId Supplied
    @GetMapping("/users/{userId}")
    public UserRating getSpecificUsersRatedMovies(@PathVariable("userId") String userId){
        //return hardcorded values for now first
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 3)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
