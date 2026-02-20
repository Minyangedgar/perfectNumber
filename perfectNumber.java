/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vupay;

import java.util.Scanner;
public class perfectNumber {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 0;

        try {
            System.out.print("Enter a positive integer: ");
            number = input.nextInt();

            if (number <= 0) {
                throw new Exception("Number must be positive.");
            }

            int sum = 0;

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            if (sum == number) {
                System.out.println(number + " is a Perfect Number.");
            } else {
                System.out.println(number + " is NOT a Perfect Number.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
    }
    
}
