package com.lavrinovich.route;

public class PublicTransportRoute implements Route{
    @Override
    public String buildRoute(String firstCity, String secondCity) {
        return String.format("Find a way by public transport between %s and %s", firstCity, secondCity);
    }
}
