package com.example.CricBuzz.Controller;


import com.example.CricBuzz.DTOS.Request.PlayerRequest;
import com.example.CricBuzz.DTOS.response.PlayerResponse;
import com.example.CricBuzz.Model.Player;
import com.example.CricBuzz.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/player")

public class PlayerController {
    @Autowired
    PlayerService playerservice;
    @PostMapping
   public PlayerResponse addplayer(@RequestBody PlayerRequest playerreq){
       //@Autowired
       //PlayerService playerservice;
       //@PostMapping
       return playerservice.addplayer(playerreq);

   }
   @GetMapping
   public Player getplayer(@RequestParam("playerid") int playerid){
        return playerservice.getplayer(playerid);
   }
}
