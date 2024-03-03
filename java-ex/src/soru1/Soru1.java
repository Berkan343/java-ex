/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru1;

import java.util.Random;

/**
 *
 * @author HD
 */
public class Soru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Rastgele Sayılarımız");
        int[] x = new int[6];
        Random rnd =new Random();
        for (int i = 0; i < 6; i++) {
            x[i]=rnd.nextInt(100);
            System.out.println(x[i]);
        }
        System.out.println("Selection Sort Algoritması Sıralaması...");
        SetSelectionSort(x);
         for (int i = 0; i < 6; i++) {           
            System.out.println(x[i]);
        }
         int[][] a = new int[][]
         {
                    {99,85,98},
                    {98,57,78},
                    {92,77,76},
                    {94,32,11},
                    {99,34,22},
                    {90,46,54}
         };
          System.out.println("Matris Çarpım Sonucu...");
         int [][] c = new int[6][3];
         for (int i = 0; i < 6; ++i) {
             for (int j = 0; j < 3; ++j) {
                 c[i][j]=x[i]*a[i][j];
                 System.out.printf("%d ",c[i][j]);
             }
             System.out.println();
        }
        
        
    }
     private static void SetSelectionSort(int [] dizi)
    {
        int n = dizi.length;
        int temp;
        int enKucuk;
        for(int i=0; i<n-1; i++)
        {
            enKucuk=i;
            for(int j=i; j<n; j++)
            {
                if (dizi[j] < dizi[enKucuk]) enKucuk=j;
            }
            temp=dizi[i];
            dizi[i]=dizi[enKucuk];
            dizi[enKucuk]=temp;
        }
    }
    

    
}
