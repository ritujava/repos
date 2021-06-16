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
public class DoItBetter {
    public static void main (String[] args){
        
        Scanner inputReader = new Scanner(System.in);
        
        int yourMile;
        int yourHotdog;
        int yourLang;
        int m;
        int h;
        int l;
        
        System.out.println("How many miles you can run?");
        yourMile = Integer.parseInt(inputReader.nextLine());
        m = yourMile * 2 + 1;
        System.out.println("you can run more by " + m);
        
        System.out.println("How many hot dog you can eat ?");
        yourHotdog = Integer.parseInt(inputReader.nextLine());
        h = yourMile * 2 + 1;
        System.out.println("You can eat more " +h);
        
        System.out.println("How many laguages you now? ");
        yourLang = Integer.parseInt(inputReader.nextLine());
        l = yourLang * 2 + 1;
        System.out.println("You can learn more " +l);
        
        
        
                
    }
    
}
