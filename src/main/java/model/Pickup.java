package model;

import javax.annotation.PostConstruct;

public class Pickup extends Transport{
    public Pickup(String model) {
        super(model);
    }
    @PostConstruct
    private void init() {
        System.out.println("Пикап модели " + getModel() + " готов к работе!!!");
    }
}
