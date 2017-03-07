/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listing22_8;

/**
 *
 * @author Benji
 */
import java.io.*;
import java.util.ArrayList;

public class Listing22_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int number = 2;
        int squareRoot = 1;
        
        while(number <= 1000000)
        {
            boolean isPrime = true;
             if(squareRoot * squareRoot < number)
             {
                 squareRoot++;
             }
             for(int k = 0; k < list.size() && list.get(k) <= squareRoot; k++)
             {
                 if(number % list.get(k) == 0)
                 {
                     isPrime = false;
                     break;
                 }
             }
             
             if(isPrime)
             {
                 list.add(number);
             }
             number++;
        }
        try( FileOutputStream output = new FileOutputStream("PrimeNumbers.dat");)
        {
            for(int i:list)
            {
                output.write(i);
                System.out.println(i);
            }
        }
    }
    
    
    
}
