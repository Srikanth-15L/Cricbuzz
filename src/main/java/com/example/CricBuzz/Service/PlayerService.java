package com.example.CricBuzz.Service;

import com.example.CricBuzz.DTOS.Request.PlayerRequest;
import com.example.CricBuzz.DTOS.response.PlayerResponse;
import com.example.CricBuzz.Exception.PlayerNotFoundException;
import com.example.CricBuzz.Model.Player;
import com.example.CricBuzz.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository playerrepository;



    public PlayerResponse addplayer(PlayerRequest playerreq) {
        //return playerrepository.save(playerreq);
        //covert the request dto to entity
        Player player = Player.builder()
                .gender(PlayerRequest.getgender())
                .age(PlayerRequest.getage())
                .name(PlayerRequest.getname())
                .country(PlayerRequest.getCountryname())
                .height(PlayerRequest.getheight())
                .build();




    }
    // public addservice()
    public  Player getplayer(int playerid) {
        Optional<Player> playeroptional=playerrepository.findById(playerid);
        if(playeroptional.isEmpty()){
            throw  new PlayerNotFoundException("invalid playerid found");
        }
        return playeroptional.get();
       // return PlayerResponse.get()

    }
}
