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
public class GuessMe {
    public static void main (String[] args){
        
        int num = 10;
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Please guess a number:");
        int num1 = Integer.parseInt(inputReader.nextLine());
        
        if(num1 == num){
           
            System.out.println("wow nice guess! That was it!");
        }
        if(num1 < num){
            System.out.println("Ha, nice try ! too low  I chose  " + num);
        }
        if(num1 > num){
            System.out.println("Too bad way too high I chose" + num);
           
        }
    }
}
