package com.example.CricBuzz.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level= AccessLevel.PRIVATE)


public class Stats {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
     int runsscored;
     int wicketstaken;
     double battingAvg;
     double bowlingAvg;


     @OneToOne
     @JoinColumn
     @JsonIgnore
     Player player;







}
