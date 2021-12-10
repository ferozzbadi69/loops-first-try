package test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
         for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5-i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
          for (int i=5; i>=1; i--)
        {
            for (int j=1; j<=5-i+1; j++)
            {
                System.out.print("* ");
            }
 
            System.out.print("\n");
        }
          System.out.println("-------------------------");
          int i =1;
          while (i<=7){
              System.out.println(Math.pow(2, i));
              i++;
          
          }
          
           
         
          
         } 
       }

