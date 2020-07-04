/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class switch_case {
      public static void main(String[] args) {
        //membuat scanner
        Scanner input = new Scanner(System.in);

        System.out.println("mood anda");
        int Rasa = input.nextInt();

        //percabangan swithc case
        switch (Rasa) {
            case 1:
                System.out.println("mood anda adalah lelah");
                break;
            case 2:
                System.out.println("mood anda adalah letih");
                break;
            case 3:
                System.out.println("mood anda adalah lesu");
                break;
           
            default:
                System.out.println("mood anda adalah bahagia");
            

        }
    }
}
