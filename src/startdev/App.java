/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;

/**
 *
 * @author Comp
 */
class App {
    public static void run() {
        
        System.out.println("1. Цельсии к Фаренгейту");
        System.out.println("2. Угадай число");
        System.out.println("3. Сумма рандомных чисел");
        System.out.println("4. Сумма всех чётных рандомных чисел");
        System.out.println("5. Двухмерный массив 10 на 5");
        System.out.println("6. Зубчатый массив");
        System.out.println("7. Количество букв в строке");
        
        System.out.print("\nВыбери программу(1-7): ");
        
        Scanner scan = new Scanner(System.in);
        int program = scan.nextInt();
       
        switch (program) {
            default:
                System.out.println("Нету такой программы.");
                break;
            case 1:
                Task1 task1 = new Task1();
                task1.run();
                break;
            case 2:
                 Task2 task2 = new Task2();
                 task2.run();  
                 break;
            case 3:
                 Task3 task3 = new Task3();
                 task3.run();
                 break;
            case 4:
                 Task4 task4 = new Task4();
                 task4.run();  
                 break;
            case 5:
                 Task5 task5 = new Task5();
                 task5.run();  
                 break;
            case 6:
                 Task6 task6 = new Task6();
                 task6.run();  
                 break;
            case 7:
                 Task7 task7 = new Task7();
                 task7.run();  
                 break;
      }
    } 

 
}
