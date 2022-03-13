package com.devsuperior.dsmovie.services;

import com.devsuperior.dsmovie.dto.MovieDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IMovieService {
    public Page<MovieDto> findAll(Pageable pageable);
    public MovieDto findById(Long id);
}
