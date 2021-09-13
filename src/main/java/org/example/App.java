package org.example;
import java.util.Scanner;

/**
 *  Self Checkout
 *  UCF cop3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Zeb Fischer-Crawford
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        int price_1 = scan.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        int quantity_1 = scan.nextInt();
        System.out.print("Enter the price of item 2: ");
        int price_2 = scan.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        int quantity_2 = scan.nextInt();
        System.out.print("Enter the price of item 3: ");
        int price_3 = scan.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        int quantity_3 = scan.nextInt();

        int total_1 = price_1 * quantity_1;
        int total_2 = price_2 * quantity_2;
        int total_3 = price_3 * quantity_3;

        float subtotal = (float)(total_1 + total_2 + total_3);
        System.out.println("Subtotal: $" + subtotal);

        float tax = (float) (subtotal * 0.055);
        System.out.println("Tax: $" + tax);

        float total = subtotal + tax;
        System.out.println("Total: $" + total);
    }
}
