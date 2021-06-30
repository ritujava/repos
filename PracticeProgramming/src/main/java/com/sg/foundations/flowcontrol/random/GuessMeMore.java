/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 15876
 */
public class GuessMeMore {
    public static void main (String[] args){
        
        Random guess = new Random();

        
        int num = guess.nextInt((100));
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println(" I Chose a number");
        int num1 = Integer.parseInt(inputReader.nextLine());
        System.out.println("your guess" +num1);
        
        if(num1 == num){
           
            System.out.println("wow nice guess! That was it!");
        }
        if(num1 < num){
            System.out.println("Ha, nice try ! too low  I chose  " + num);
        }
        if(num1 > num){
            System.out.println("Too bad way too high I chose" + num);
           
        }
    }
}
