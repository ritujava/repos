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
public class QuestForTheUserInput {
    public static void main(String[] args){
        
        Scanner inputReader = new Scanner(System.in);
        
        String yourName;
        String yourQuest;
        double velocityofSwallow;
        
        //We can use the Scanner's readLine to assign value to our strings
        //because its return type is string
        System.out.print("What is your name?");
        yourName = inputReader.nextLine();
        
        System.out.print("What is your quest?!");
        yourQuest = inputReader.nextLine();
        
        //When we get to our double data type, we can use Scanner'snextDouble method
        //or we can usethe Double.parseDoubleto convert the nextLine's String
        
        System.out.print("What is your the airspeed velocity of an unladen swallow!?!");
        velocityofSwallow = Double.parseDouble(inputReader.nextLine());
        System.out.println();
        System.out.println("How do you know " + velocityofSwallow + "is correct ," +
                yourName + "?");
        System.out.println("You didn't even know if the swallow was African or European!");
        System.out.println("Maybe skip answering things about birds and instead go" +
                yourQuest + ".");
        
    }
    
    
    
}
