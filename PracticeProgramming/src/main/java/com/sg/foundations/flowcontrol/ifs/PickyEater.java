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
public class PickyEater {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("How many times it is fried? (#)");
        int timesFried = Integer.parseInt(userInput.nextLine());
        
        System.out.print("Does it has any Spinach in it? (Y/N)");
        String hasSpinach = userInput.nextLine();
        
        System.out.print("Is it covered in cheese ? (Y/N");
        String cheeseCovered = userInput.nextLine();
        
        System.out.println("How manty Pats of butter on top? (#) ");
        int butterPats = Integer.parseInt(userInput.nextLine());
        
        System.out.print("Is it covered in chocolate? (Y/N)");
        String chocolateCovered = userInput.nextLine();
        
        System.out.println("Does it have funny name? (Y/N) ");
        String funnyName = userInput.nextLine();
        
        System.out.print("IS it broccoli? (Y/N)");
        String isBroccoli = userInput.nextLine();
        
        if(hasSpinach.equals("Y") || funnyName.equals("y")){
            System.out.println("There is no way He will it that!");
        }
        
        }  
    
    
    }
