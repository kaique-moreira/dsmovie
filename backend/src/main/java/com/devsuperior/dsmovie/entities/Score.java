package com.devsuperior.dsmovie.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_score")
public class Score {
    @EmbeddedId
    private ScorePK id = new ScorePK();
    @Column
    private Double value;

}
