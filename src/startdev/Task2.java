/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;
import java.util.Scanner;

class Task2 {
    public void run(){
        System.out.println("Угадай задуманное число.");
        System.out.println("---------------------------");
        int min = 5;
        int max = 10;
        Random random = new Random();
        int myNumber = random.nextInt(max-min+1)+min;
        System.out.println("Задумано число от "+min+" до "+max+". Угадай!");
        Scanner scanner = new Scanner(System.in);
        int gamerNumber = scanner.nextInt();
        if(myNumber == gamerNumber){
            System.out.println("Ты выиграл!");
        }else{
                System.out.println("Ты проиграл. Задумано число: "+myNumber);
       }
    }       
}    

