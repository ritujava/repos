/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 15876
 */
public class GuessMeFinally {
    public static void main (String[] args){
        Random guess = new Random();

        
        int randomNumber = guess.nextInt((100) + 1);
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println(" I have chosen number between -100 to 100  " +randomNumber);
        while(true){
        int userNumber = Integer.parseInt(inputReader.nextLine());
        System.out.println("your guess" +userNumber);
        
        if( userNumber == randomNumber ){
           
            System.out.println("Wow nice guess! That was it!");
        }else if( randomNumber > userNumber){
            
            System.out.println("Ha, nice try ! too low " );
        }else{
            
          System.out.println("Too bad way too high " );
           
        }
        }
    }
    
    
    }                 
