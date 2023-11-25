package com.example.springgraphqldemo.actor;

import com.example.springgraphqldemo.movie.Movie;

import java.util.List;

public record Actor(Long id, String name, String birthDate, List<Movie> movies) {

}

