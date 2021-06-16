/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

import java.util.Scanner;

/**
 *
 * @author 15876
 */
public class BiggerBetterAdder {
    public static void main(String[] args){
        
        Scanner inputReader = new Scanner(System.in);
        
        int firstNum;
        int secondNum;
        int thirdNum;
        int sum;
        
        
        
       System.out.println("Enter the first number to be added ");
        firstNum = Integer.parseInt(inputReader.nextLine());
        System.out.println("Enter second number to be added ");
        secondNum = Integer.parseInt(inputReader.nextLine());
        System.out.println("Enter the third number to be added ");
        thirdNum = Integer.parseInt(inputReader.nextLine());
        sum = firstNum + secondNum + thirdNum;
        
        System.out.println("Sum of three number is " + firstNum + "+" + secondNum + "+" + thirdNum + "=" +sum);
        
    }
        
        
        
    
}
