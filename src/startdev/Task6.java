

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Arrays;

/**
 *
 * @author Comp
 */
class Task6 {
    public void run(){
    int[][]jaggedArr = {{1, 2}, {3, 4, 5}, {6, 7, 8 ,9}};
        for (int[] jaggedArr1 : jaggedArr) {
            for (int inner = 0; inner < jaggedArr1.length; inner++) {
                    jaggedArr1[inner] = (int) Math.round((Math.random() * 100) - 50);
                    for (int[] jaggedArr2 : jaggedArr) {
                        System.out.println(Arrays.toString(jaggedArr2));

                }
            }
        }
    }
}


/*package startdev;

import java.util.Arrays;
import java.util.Scanner;

 class Task6 {
    public void run(){
        int[][]jaggedArr = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        jaggedArr[0]= new int[2];
        jaggedArr[1]= new int[3];
        jaggedArr[2]= new int[4];
        void() int[][] = nulljaggedArr;
{
            Scanner sc = new Scanner(System.in);
            for (int[] jaggedArr2 : jaggedArr) {
                for (int inner = 0; inner < jaggedArr2.length; inner++) {
                    jaggedArr2[inner] = sc.nextInt();
                    void printElements
                            int[][]
                                    nulljaggedArr
                                    {
                                        for (int[] jaggedArr1 : jaggedArr) {
                                            System.out.println(Arrays.toString(jaggedArr1));
                                        }
                                    }               }
            }
}
   }
}*/