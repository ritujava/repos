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
public class PassingTheTuringTest {
    public static void main(String[] args){
        
        Scanner inputReader = new Scanner(System.in);
        
        String yourName;
        String myName;
        String yourColor;
        String myColor;
        String yourFood;
        String myFood;
        double yourNumber;
        double myNumber;
        
        System.out.println("What is you name?");
        yourName = inputReader.nextLine();
        System.out.println("My name");
        myName = inputReader.nextLine();
        System.out.println("What is your favorite color ?");
        yourColor = inputReader.nextLine();
        System.out.println("My faourite color");
        myColor = inputReader.nextLine();
      
        System.out.println("What is your favorite food?");
        yourFood = inputReader.nextLine();
         System.out.println("My favourite food");
        myFood = inputReader.nextLine();
        System.out.println("What is your favourite number? ");
        yourNumber = Double.parseDouble(inputReader.nextLine());
        System.out.println("My favurite number");
        myNumber = Double.parseDouble(inputReader.nextLine());
        
        double a = myNumber * yourNumber;
        
        System.out.println("Hi " + yourName + "! I am  " + myName + ".");
        System.out.println("Huh," + yourColor + "? Mine's is " + myColor);
        System.out.println("I like" + myFood + ". They are my favorite food too");
        System.out.println(+ yourNumber + "is cool number. Mine is " + myNumber);
        System.out.println("Did you know " + yourNumber + "*" + myNumber + " is " + a);
        System.out.println("Well Thanks for talking to me ! " + yourName);
    }          
                 
}
