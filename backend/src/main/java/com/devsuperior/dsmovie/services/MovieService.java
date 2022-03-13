package com.devsuperior.dsmovie.services;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class MovieService implements IMovieService {
    private MovieRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        return repository.findAll(pageable)
                .map(MovieDTO::new);
    }

    @Override
    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        return repository.findById(id)
                .map(MovieDTO::new)
                .get();
    }

}
