package com.devsuperior.dsmovie.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class ScoreDTO implements Serializable {
    private Long movieId;
    private String email;
    private Double score;
}
