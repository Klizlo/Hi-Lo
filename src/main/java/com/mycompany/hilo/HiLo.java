/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hilo;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Klizlo
 * @version 1.0
 * 
 */
public class HiLo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        String playAgain = "";
        do{
            int number = new Random().nextInt(100)+1;    // draw the number between 1 and 100 (closed interval)
            int guess = 0;
            while (guess != number){
                System.out.println("Guess anumber between 1 and 100:");
                guess = scr.nextInt();
                if(guess < number)
                    System.out.println(guess+" is too low. Try again.");
                else if(guess == number)
                    System.out.println(guess+" is correct. You win!");
                else
                    System.out.println(guess+" is too high. Try again.");
            }
            System.out.println("Would you like to play again (y/n)?");
            playAgain = scr.next();
        }while(playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing.");
        scr.close();
    }
    
}
