package com.lavrinovich.route;

public class CarRoute implements Route{

    @Override
    public String buildRoute(String firstCity, String secondCity) {
        return String.format("Find a way by car between %s and %s", firstCity, secondCity);
    }
}
