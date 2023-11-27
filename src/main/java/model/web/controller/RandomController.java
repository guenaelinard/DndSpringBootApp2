package model.web.controller;

import model.dao.RandomDao;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {

    private final RandomDao randomDao;

    public RandomController (RandomDao randomDao){
        this.randomDao = randomDao;
    }

}
