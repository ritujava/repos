/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jritu.adder;

import java.util.Scanner;

/**
 *
 * @author 15876
 */
public class adder {
    public static void main(String[] args) {
        int sum=0;
        int operand1 = 3;
        int operand2 = 2;
        
        Scanner sc = new Scanner(System.in);
        
        String string0perand1 = "";
        String string0perand2 = "";
        
        System.out.println("Please enter the first number to be added=");
        string0perand1 = sc.nextLine() ;
        
        System.out.println("Please enter the second number to be added=");
        string0perand2 = sc.nextLine() ;
        
        operand1 = Integer.parseInt(string0perand1);
        operand2 = Integer.parseInt(string0perand2);
        
        
        sum = operand1 + operand2;
        
        System.out.println("Sum is :" + sum);
    }
    
}
