/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadoViciado;

import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class dadoViciado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int nTimes, i, side;
        double num, perc;
        int dice [] = new int[6];
        //inserts the number of times the die will be rolled
        System.out.println("Enter the number of times the die was cast: ");
        nTimes = sc.nextInt();        
        
        for(i = 0; i < nTimes; i++)   {
            System.out.println("Enter the face of the dice: ");
            side = sc.nextInt();
            //increment of the value that the face of the data appeared inside the vector
            dice[side - 1]++;
            
        }
        for(i = 0; i < dice.length; i++) {
	
            //Calculation of the percentage that appeared
            num = dice[i];
            perc = ((num / nTimes) * 100);
            System.out.println("A face " + (i + 1) + " caiu " + dice [i] + " times percetual of " + perc + "% apppear.");
            

    }
    } 
}
