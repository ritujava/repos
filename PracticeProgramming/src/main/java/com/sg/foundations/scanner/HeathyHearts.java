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
public class HeathyHearts {
    public static void main (String[] args){
        
        Scanner inputReader = new Scanner(System.in);
        
        int yourAge;
        int heartRate;
        float trZone;
        
        System.out.println("What is you age?");
        yourAge = Integer.parseInt(inputReader.nextLine());
        
        heartRate = 220 - yourAge;
        trZone =  85 % heartRate;
        System.out.println("Your maximum heartrate should be  " + heartRate  + " per minute.");
        System.out.println("Your target  HR zone is " + trZone + " per minute ");
        
        
        
    }
    
}
