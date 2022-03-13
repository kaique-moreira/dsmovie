package com.devsuperior.dsmovie.services;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.entities.User;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import com.devsuperior.dsmovie.repositories.ScoreRepository;
import com.devsuperior.dsmovie.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class ScoreService implements IScoreService{

    private ScoreRepository scoreRepository;
    private UserRepository userRepository;
    private MovieRepository movieRepository;


    @Override
    @Transactional
    public MovieDTO saveScore(ScoreDTO scoreDTO) {
        User user = userRepository.findByEmail(scoreDTO.getEmail());
        if (user == null){
            user = new User();
            user.setEmail(scoreDTO.getEmail());
            user = userRepository.saveAndFlush(user);
        }
        Movie movie = movieRepository.findById(scoreDTO.getMovieId()).get();
        Score score = new Score();
        score.getId().setUser(user);
        score.getId().setMovie(movie);
        score.setValue(scoreDTO.getScore());
        score = scoreRepository.saveAndFlush(score);

        movie.setScore(movie.getScores().stream()
                .mapToDouble(Score::getValue)
                .average().orElse(0.0));
        movie.setCount(movie.getScores().size());
        movie = movieRepository.saveAndFlush(movie);

        return new MovieDTO(movie);
    }
}
