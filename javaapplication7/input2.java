/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class input2 {
     public static void main(String[]arga) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String Nama="";
        try {
            System.out.print("Tuliskan Nama Anda : ");
            Nama = dataIn.readLine();
            System.out.print("berapa nim anda : ");
            Nama = dataIn.readLine();
            System.out.print("apa jurusan anda : ");
            Nama = dataIn.readLine();
            
            
                    
                    
        } catch (IOException e){
    }
        System.out.println("hallo nama anda adalah " + Nama);
            
            
            
                }
         
    
}
