package com.devsuperior.dsmovie.services;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;

public interface IScoreService {
    MovieDTO saveScore(ScoreDTO scoreDTO);
}
