/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author 15876
 */
public class TraditionalFizzBuzz {
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many time of fizzing and buzzing do you need in your life?" );
        int number = userInput.nextInt();
        
        for(int i = 0; i <=number; i++){
            System.out.println(+i);
        
          if( (i  % 3 )== 0) {
              System.out.println("Fizz");
             }
          if( (i % 5)== 0){
              System.out.println("Buzz");
          }
           
        }
    }
}
