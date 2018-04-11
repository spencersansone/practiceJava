/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispalindrome;
import java.util.Scanner;

/**
 *
 * @author Spencer
 */
public class IsPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Goal: take in a user string input and tell the user whether or not
        // the string is a palandrome (same backwards as it is forwards)
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter string:");
        
        String answer = s.nextLine();
        String answerReversed = new StringBuilder(answer).reverse().toString();
        
        if(answer.equals(answerReversed)){
            System.out.println("Yes, this is a palindrome.");
        } else{
            System.out.println("No, this is not a palindrome.");
        }
    }
    
}
