package com.lavrinovich.route;

public class PlaneRoute extends Route {

    @Override
    public void buildRoute() {
        System.out.printf("Find a way by plane between %s and %s\n", firstCity, secondCity);
    }
}
