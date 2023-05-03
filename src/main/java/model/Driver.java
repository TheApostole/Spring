package model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;


@EqualsAndHashCode
@Getter
@AllArgsConstructor
public class Driver {
    private String name;
    private Transport transport;

    @Override
    public String toString() {
        return "Водитель " + name + " управляет " + transport;
    }
}
