package model;

import javax.annotation.PostConstruct;

public class Car extends Transport {
    public Car(String model) {
        super(model);
    }
    @PostConstruct
    private void init() {
        System.out.println("Легковой автомобиль модели " + getModel() + " готов к работе!!!");
    }

}
