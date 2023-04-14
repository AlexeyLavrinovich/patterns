package com.lavrinovich.route;

public class PlaneRoute implements Route{
    @Override
    public String buildRoute(String firstCity, String secondCity) {
        return String.format("Find a way by plane between %s and %s", firstCity, secondCity);
    }
}
