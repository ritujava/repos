/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author 15876
 */
public class DontForgetToStoreIt {
    public static void main (String[] args){
        
        int meaningofLifeAndEverything = 42;
        double pi = 3.14159;
        String cheese, color;
        
        cheese = "mozrella";
        color = "blue";
        
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Give me pi to at least 5 decimals");
        Double.parseDouble(inputReader.nextLine());
        
        System.out.println("What is the meaning of life, the universe and everything?"
                );
        Integer.parseInt(inputReader.nextLine());
        
        System.out.println("What is you favorite kind of cheese? ");
        inputReader.nextLine();
        
        System.out.println("Do you like the color red or blue more? ");
        inputReader.nextLine();
        
        System.out.println("Ooh , " + color + " " + cheese + "sounds delicious!");
        System.out.println(" The circumference of lifeis " + (2 * pi * meaningofLifeAndEverything));
        
         
    }
    
}
