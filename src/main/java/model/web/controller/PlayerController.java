package model.web.controller;

//import model.dao.RandomDao;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class PlayerController {

    RestTemplate restTemplate;

    public PlayerController() {
        this.restTemplate = new RestTemplate();
    }

    @GetMapping(value = "/random-name")
    public String getRandomName() {
        String url = "https://random-word-api.herokuapp.com/word";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }


//    @GetMapping("/random-player")
//    public Object getRandomExistingPlayer() {
//        int randomID = (int) Math.floor(Math.random() * (playerList.size));
//        String url = "http://localhost:8082/random-player";
//
//        return null;
//    }

}
