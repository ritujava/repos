/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author 15876
 */
public class LamasWhalesAndDodoOhMy {
    public static void main (String[] args){
        int llamas = 20;
        int whales = 15;
        int dodos = 0;
        
        if(dodos > 0){
            System.out.println("Egdas , I thought dodos we are extinct!");
        }
        if(dodos < 0){
            System.out.println("Hold on how can we NEGATIVE dodos??!");
        }
        if(llamas > whales){
           System.out.println("whales may be bigger ,but llamas are better ,ha!");
            
        }
        if(llamas <= whales){
            System.out.println("Aw man,brawn over brains I guess . Whales beat llamas.");
        }
        System.out.println("There's been a huge increase in the dodo population via cloning!");
        dodos += 100;
        
        if((whales +llamas)< dodos){
            System.out.println("I never thought i'd see the day when dodos ruled the earth.");
        }
        if(llamas > whales || llamas > dodos){
            System.out.println("I don't know how, but the llamas have come out ahead! Sneaky!");
            
        
        }
                
    }
}
