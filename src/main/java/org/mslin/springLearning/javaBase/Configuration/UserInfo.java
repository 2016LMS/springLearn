package org.mslin.springLearning.javaBase.Configuration;

public class UserInfo {
    private int id;
    private Country country;

    public UserInfo(Country country) {
        this.country = country;
    }
}
