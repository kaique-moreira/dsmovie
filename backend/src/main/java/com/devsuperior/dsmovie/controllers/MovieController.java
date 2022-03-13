package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.dto.MovieDto;
import com.devsuperior.dsmovie.services.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    private MovieService service;
    @GetMapping
    public Page<MovieDto> findAll(Pageable pageable){
        return service.findAll(pageable);
    }

    @GetMapping(value = "/{id}")
    public MovieDto findById(Long id){
        return service.findById(id);
    }
}
