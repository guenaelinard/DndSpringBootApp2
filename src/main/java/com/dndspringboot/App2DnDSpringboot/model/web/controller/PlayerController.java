package com.dndspringboot.App2DnDSpringboot.model.web.controller;

//import com.dndspringboot.App2DnDSpringboot.model.dao.RandomDao;
import com.dndspringboot.App2DnDSpringboot.model.Player;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PlayerController {

    RestTemplate restTemplate;
    public static List<Player> playerList = new ArrayList<>();

    public PlayerController() {
        this.restTemplate = new RestTemplate();
    }

    @GetMapping(value = "/random-name")
    public String getRandomName() {
        String url = "https://random-word-api.herokuapp.com/word";
        return restTemplate.getForObject(url, String.class);
    }


    @GetMapping("/random-player/{id}")
    public Object getRandomExistingPlayer(@PathVariable int id) {
        int randomID = (int) Math.floor(Math.random() * (playerList.size()));
        String url = "http://localhost:8082/random-player";


        return null;
    }

}
