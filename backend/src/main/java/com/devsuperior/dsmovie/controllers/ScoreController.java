package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.services.MovieService;
import com.devsuperior.dsmovie.services.ScoreService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
    private ScoreService scoreService;

    @PutMapping
    public MovieDTO findById(@RequestBody ScoreDTO scoreDTO){
        return scoreService.saveScore(scoreDTO);
    }
}
