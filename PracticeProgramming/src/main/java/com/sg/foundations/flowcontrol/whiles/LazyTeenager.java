/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author 15876
 */
public class LazyTeenager {
    public static void main (String[] args){
        Random chance = new Random(7);
        
        int x = 0;
        do{
           System.out.println("Clean your Room !!" +x);
           x++;
           if(x ==5){
               System.out.println("Fine I will clean my Room.");
           }
        }while( x <= 7 );
        System.out.println("Thats it i am doing it .You are grounded");
        }
    }

