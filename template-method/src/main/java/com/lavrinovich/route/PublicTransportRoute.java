package com.lavrinovich.route;

public class PublicTransportRoute extends Route{
    @Override
    public void askForSecondCity() {
    }

    @Override
    public void buildRoute() {
        System.out.println("Error: can't build a route!\n");
    }
}
