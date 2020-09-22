/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;

/**
 *
 * @author Comp
 */
class Task5 {
    public void run(){
    int[][] a = new int[5][10];
        int max, min;
        Random rnd = new Random();
        for (int i=0;i < a.length;i++) {
            for (int j=0;j < a[i].length;j++) {
                a[i][j]=rnd.nextInt(10) + 1;
            }
        }
        for (int i=0;i < a.length;i++,System.out.println()) {
            for (int j=0;j < a[i].length;j++) {
                System.out.print(a[i][j]+" ");
            }
        }
    }
}
