/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jritu.windowmaster;

import java.util.Scanner;

/**
 *
 * @author 15876
 */
public class WindowMaster {
    public static void main(String [] args){
        //declare variables for height and width
        float height;
        float width;
        
        //declare String variiable to hold the user's height and width input
        String stringHeight;
        String stringWidth;
        
        //declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        //declare varible for window glass per square foot
        float glassCost;
        
        //declare variable for trim window per linear foot
        float trimCost;
        
        //declare variable to hold value window glass nd trim per square foot
        String stringglassCost;
        String stringtrimCost;
        
        
        //declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        //get input from user
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window witdh");
        stringWidth = myScanner.nextLine();
        System.out.println("Please enter the cost of glass per square foot=");
        stringglassCost = myScanner.nextLine();
        System.out.println("Please enter the cost of trim per linear square foot =");
        stringtrimCost = myScanner.nextLine();
        
        
        //convert String values of height and witdth to float values
        
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        glassCost = Float.parseFloat(stringglassCost);
        trimCost = Float.parseFloat(stringtrimCost);
        
        //calculate area of window
        areaOfWindow = height * width;
        
        //calculate perimeter of window
        perimeterOfWindow = 2 * (height + width);
        
        //calculate the total material cost foe window
        cost = ((glassCost * areaOfWindow) + (trimCost * perimeterOfWindow));
        
        //display the result to the user
        
        System.out.println("Window height=" + stringHeight);
        System.out.println("Window width=" + stringWidth);
        System.out.println("Window area = " +areaOfWindow);
        System.out.println("Window Perimeter =" +perimeterOfWindow );
        System.out.println("Total cost =" + cost);
        
        
    }
    
}
