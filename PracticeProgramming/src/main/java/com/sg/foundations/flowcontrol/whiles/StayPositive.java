/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author 15876
 */
public class StayPositive {
    public static void main (String[] args){
        
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please input starting number");
        int a = Integer.parseInt(inputReader.nextLine());
       
        
        while(a > 0){
            System.out.println( +a+ "" );
             a--;
        }
             System.out.println( +a+ "");
        
    System.out.println("Blast off!");
        
    }    
        
    }
    

