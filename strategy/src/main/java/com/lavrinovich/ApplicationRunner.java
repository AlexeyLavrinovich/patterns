package com.lavrinovich;

import com.lavrinovich.route.CarRoute;
import com.lavrinovich.route.PlaneRoute;
import com.lavrinovich.route.PublicTransportRoute;

public class ApplicationRunner {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new CarRoute());
        navigator.init();
        navigator.setRoute(new PlaneRoute());
        navigator.init();
        navigator.setRoute(new PublicTransportRoute());
        navigator.init();
    }
}
