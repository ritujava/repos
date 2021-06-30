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
public class TriviaNight {
   public static void main (String[] args){
       
       Scanner reader =new Scanner(System.in);
       int numCorrect = 0;
       
       System.out.println("What is the Lowest Level Programming Language?");
       System.out.println("1) Source Code       2) Assembly Language \n 3) C#     4) machine Code ");
       
       String response = reader.nextLine();
       if(response.equals("4"))
       {
           System.out.println("correct");
           numCorrect = +1;
       }
       else
       {
        System.out.println("nope.Good try");
       }
       System.out.println("Website Security CAPTHA Forms are Descended Form the Work of?" );
       System.out.println("1) Grace Hopper     2) Alan Turing \n 3)Charls Babbage    4) Larry Page");
       
       response = reader.nextLine();
       if(response.equals("2"))
       {
           System.out.println("correct");
           numCorrect = +2;
       }
       else{
           System.out.println("Nope. Good try");
       }
      System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size"
              + "Replica in Las Vegas");
       System.out.println("1) Serenity       2)The Battlestar Galactica \n "
               + "3) The USS Enterprise     4)The Millennium Falcon");
       
       response = reader.nextLine();
       if(response.equals("3"))
       {
           System.out.println("correct");
           numCorrect = +3;
       }
       else{
           System.out.println("Nope. Good try");
       }
       int totalQuestion = 3;
       double score = (100.0*numCorrect)/totalQuestion;
       
       System.out.println(" You got " +numCorrect + "  correct your score -" + score + "%");
       }    
           
}
     
