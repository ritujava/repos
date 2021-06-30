/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author 15876
 */
public class BirthStones {
    public static void main (String[] args){
        
        Scanner inputReader = new Scanner(System.in);
        int month;
        
        System.out.println("Please enter your birth month");
        month = Integer.parseInt(inputReader.nextLine());
        
        if(month == 1){
            System.out.println("You entered Jnanuary , Your birthstone is Garnet");
        }
        if(month == 2){
            System.out.println("You entered February, Your birthstone is Amethyst");
        }
        if(month == 3){
          System.out.println("You entered March , Your birthstone is  Aquamarine");  
        }
         if(month == 4){
             System.out.println("You entered April , Your birthstone is Daimond "); 
         }
          if(month == 5){
             System.out.println("You entered May , Your birthstone is Emerald "); 
         }
         if(month == 6){
             System.out.println("You entered June , Your birthstone is Pearl"); 
         }
          if(month == 7){
             System.out.println("You entered July, Your birthstone is Ruby"); 
          }
            if(month == 8){
             System.out.println("You entered August , Your birthstone is Peridot"); 
         }
            if(month == 9){
             System.out.println("You entered September , Your birthstone is Sapphire"); 
         }
            if(month == 10){
             System.out.println("You entered October, Your birthstone is  Opal"); 
         }
            if(month == 11){
             System.out.println("You entered November , Your birthstone is Topaz"); 
         }
              if(month == 12){
             System.out.println("You entered December , Your birthstone is Torquoise"); 
         }else {
             System.out.println("You entered wrong number ,Please enter month number"); 
              }
        
            } 
}