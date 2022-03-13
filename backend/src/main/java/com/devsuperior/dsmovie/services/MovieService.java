package com.devsuperior.dsmovie.services;

import com.devsuperior.dsmovie.dto.MovieDto;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MovieService implements IMovieService {
    private MovieRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Page<MovieDto> findAll(Pageable pageable) {
        return repository.findAll(pageable)
                .map(MovieDto::new);
    }

    @Override
    @Transactional(readOnly = true)
    public MovieDto findById(Long id) {
        return repository.findById(id)
                .map(MovieDto::new)
                .get();
    }

}
