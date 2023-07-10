package ru.symbat.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private movieRepozitory movieRepozitory;


    public List<Movie> findAllMovies() {
        System.out.println(movieRepozitory.findAll().toString());
        return movieRepozitory.findAll();
    }

    public Optional<Movie> getOneMovie(String imdbId){
        return movieRepozitory.findMovieByImdbId(imdbId);
    }

}
