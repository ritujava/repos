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
public class AllTheTrivia {
    public static void main(String[] args){
        
        Scanner inputReader =new Scanner(System.in);
        
        String ansOne;
        String ansTwo;
        String ansThree;
        String ansFour;
        
        System.out.println("What number is equivalent to 1024 Gigabytes?");
        ansOne = inputReader.nextLine();
        
        System.out.println("Which Planet that only rotate clockwise in our Solar System?");
        ansTwo = inputReader.nextLine();
        
        System.out.println("The largest volacano ever discovered in our solar system islocated on which planet?");
        ansThree = inputReader.nextLine();
        
        System.out.println("What is the most abudant element in the earth's atmosphere?");
        ansFour = inputReader.nextLine();
        
        System.out.println("wow, 1,024 Gigabytes is " + ansOne + "!");
        System.out.println("I didn't know that the largest ever volcano was discovered on " + ansThree + "!");
        System.out.println("Thats amazing that " + ansFour + " is the most abudant element in the atmosphere...");
        System.out.println( "" + ansTwo + " is the only planet that rotates clockwise,neat!");
        
        
    
        
                
               
        
        
        
        
        
    }
    
}
