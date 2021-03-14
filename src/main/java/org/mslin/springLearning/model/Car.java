package org.mslin.springLearning.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String name;

    private int price;

    private User user;
}
