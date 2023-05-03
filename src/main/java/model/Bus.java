package model;

import javax.annotation.PostConstruct;

public class Bus extends Transport {

    public Bus(String model) {
        super(model);
    }
    @PostConstruct
    private void init() {
        System.out.println("Автобус модели " + getModel() + " готов к работе!!!");
    }

}
