package com.example.CricBuzz.Model;

import com.example.CricBuzz.Model.Enum.Gender;
import com.example.CricBuzz.Model.Enum.TypeOfPlayer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Player {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    @Enumerated(EnumType.STRING)
    Gender gender;
     int age;
     String name;
     String country;
    double height;
    double weight;
    @Enumerated(EnumType.STRING)
    TypeOfPlayer typeOfPlayer;


    @ManyToOne
    @JoinColumn
    Team team;



    @OneToOne(mappedBy="player")
    //@JsonIgnore
    Stats stats;
}
