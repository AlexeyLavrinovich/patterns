package com.lavrinovich;

import com.lavrinovich.route.Route;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Navigator {

    private Route route;

    public void init(){
        route.askForFirstCity();
        route.askForSecondCity();
        route.buildRoute();
    }
}
