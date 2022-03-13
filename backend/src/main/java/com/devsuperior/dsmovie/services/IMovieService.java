package com.devsuperior.dsmovie.services;

import com.devsuperior.dsmovie.dto.MovieDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IMovieService {
    Page<MovieDTO> findAll(Pageable pageable);
    MovieDTO findById(Long id);
}
