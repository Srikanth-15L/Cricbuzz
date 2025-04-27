package com.example.CricBuzz.Model;

import com.example.CricBuzz.Model.Enum.MatchType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level= AccessLevel.PRIVATE)

public class CricketMatch {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    String Title;

    @Enumerated(EnumType.STRING)
    MatchType Type;
    int overs;
    String place;
    @CreationTimestamp
    Date startedAt;

    @ManyToMany
    @JoinTable(name="match_team",joinColumns = {@JoinColumn(name="cricketmatch_id")},
    inverseJoinColumns ={@JoinColumn(name="teamid")} )
    List<Team> teams = new ArrayList<>();

}
