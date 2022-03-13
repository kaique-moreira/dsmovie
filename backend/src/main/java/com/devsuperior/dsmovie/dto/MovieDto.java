package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto implements Serializable {
    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

    public MovieDto(Movie m) {
        this.id = m.getId();
        this.title = m.getTitle();
        this.score = m.getScore();
        this.count = m.getCount();
        this.image = m.getImage();
    }
}
