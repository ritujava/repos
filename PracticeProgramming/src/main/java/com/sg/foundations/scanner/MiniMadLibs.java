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
public class MiniMadLibs {
    public static void main (String[] args){
        Scanner inputReader = new Scanner(System.in);
        
        String firstNoun;
        String adj1Adj;
        String secNoun;
        int oneNum;
        String adj2Adj;
        String pl1Noun;
        String pl2Noun;
        String pl3Noun;
        String prVerb;
        String paVerb;
        
        System.out.println("I need a noun:");
        firstNoun = inputReader.nextLine();
        System.out.println("Now an adjective");
        adj1Adj = inputReader.nextLine();
        System.out.println("Another noun:");
        secNoun = inputReader.nextLine();
        System.out.println("Add a number");
        oneNum = Integer.parseInt(inputReader.nextLine());
        System.out.println("Another adjective");
        adj2Adj = inputReader.nextLine();
        System.out.println("A plural noun");
        pl1Noun = inputReader.nextLine();
        System.out.println("Another plural noun");
        pl2Noun = inputReader.nextLine();
        System.out.println("Another Noun");
        pl3Noun = inputReader.nextLine();
        System.out.println("A verb (infinitive one) ");
        prVerb = inputReader.nextLine();
        System.out.println("Verb in past participle");
        paVerb = inputReader.nextLine();
        System.out.println("*************** NOW LETS GET MAD (libs)********************");
        System.out.println(  firstNoun + " : the " + adj1Adj + "frontier. These are the voyages of"
                 + " starship " + secNoun + " .Its " + oneNum + " \n -year mission : to explore strange "
        + adj2Adj + " " + pl1Noun + ",to week out " + adj2Adj + " " + pl2Noun + " and \n " + adj2Adj + "" 
                + pl3Noun + ", to boldly " + prVerb + "where no one has" + paVerb);
        
        
        
    }
    
}
