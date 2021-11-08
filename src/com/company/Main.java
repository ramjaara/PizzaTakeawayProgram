package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pizzaPrice = 0;
        try{
            System.out.println("Would you like a small, medium or large pizza?");
            String pizzaSize = input.next();
            if(pizzaSize.equals("small")){
                pizzaPrice = 7.99;
            }
            if(pizzaSize.equals("medium")){
                pizzaPrice = 10.99;
            }
            if(pizzaSize.equals("large")){
                pizzaPrice = 13.99;
            }
            System.out.println("How many toppings would you like?");
            double amountOfToppings = input.nextDouble();
            amountOfToppings = amountOfToppings * 1.25;
            pizzaPrice = pizzaPrice + amountOfToppings;
            System.out.println("Your total price is " + pizzaPrice);

        }   catch(Exception e){
            System.out.println("Invalid input" + e);
        }

    }
}
