package com.example.CricBuzz.Repository;

import com.example.CricBuzz.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
}
