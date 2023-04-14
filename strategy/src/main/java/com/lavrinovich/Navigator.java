package com.lavrinovich;

import com.lavrinovich.route.Route;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Scanner;

@Data
@AllArgsConstructor
public class Navigator {

    public Route route;

    public void init(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start point of the route: ");
        String firstCity = scanner.nextLine();
        System.out.print("Enter the end point of the route: ");
        String secondCity = scanner.nextLine();
        System.out.println(route.buildRoute(firstCity, secondCity));
    }

}
