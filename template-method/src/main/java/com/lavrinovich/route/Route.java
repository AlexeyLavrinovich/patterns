package com.lavrinovich.route;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Route {

    protected String firstCity;
    protected String secondCity;
    private final Scanner scanner = new Scanner(System.in);

    public void askForFirstCity(){
        System.out.print("Enter the start point of the route: ");
        firstCity = scanner.nextLine();
    }

    public void askForSecondCity(){
        System.out.print("Enter the end point of the route: ");
        secondCity = scanner.nextLine();
    }

    public void buildRoute(){
        System.out.printf("Can't find a way between %s and %s \n", firstCity, secondCity);
    }

}
