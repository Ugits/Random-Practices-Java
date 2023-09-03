/**
 * -- Brute Force Reversing MD5 Hash --
 * 
 * DESCRIPTION:[GitHub](https://github.com)
 * A class demonstrating how to crack a password by brute force, with a part of the password given and the Hash (MD5). 
 * Using the alphabet, we randomly test combinations of five letter words, 
 * to be combined with the given part of the password.
 * After combined, we will then hashing the generatedPassword into MD5.
 * This allows us to compare the generated Hash to the true Hash.
 * The program will loop the process until it is a match, 
 * then the console prints the complete password and confirms the equality of the hashes.
 * 
 * TASK:
 * The given part of the password in this example is: "AdaLovelace-". 
 * We want to figure out an additional unknown 5 chars followed by the given: "AdaLovelace-xxxxx".
 * There´s also a given Hash (String trueHash), corresponding to the complete password.
 * 
 * ORIGIN TO PROJECT: 
 * Online "Escape Rooms" -> https://csharpskolan.se/escape-rooms/ (lang: Swedish)
 * Encounter given tasks, and solve them by problemsolving, logical thinking and coding.
 */

package Decryption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class BruteForceHash {
    
    public static String calculateMD5(String input){
        //Calculates the MD5 hash of the input string
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");        
            byte[] digest = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02X", b & 0xff));    
            }
            return sb.toString();          
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String abc = "abcdefghijklmnopqrstuvwxyz";
    
    public static void main(String[] args) {
        
        String trueHash = "0CF2FCF4598769F395B7CC0528C09C0E";
        String generatedHash = "";
        String completePassword = "";
        String partOnePassword = "AdaLovelace-";
        char c1, c2, c3, c4, c5;

        // TODO - Method of while
        while (!generatedHash.equals(trueHash)) {
            
            System.out.println("*");
            Random randomNum = new Random();
            
            // TODO - Refactor while, variabler in Arrays and set checks in For Each??
            c1 = abc.charAt(randomNum.nextInt(0, 24));
            c2 = abc.charAt(randomNum.nextInt(0, 24)); 
            c3 = abc.charAt(randomNum.nextInt(0, 24)); 
            c4 = abc.charAt(randomNum.nextInt(0, 24));
            c5 = abc.charAt(randomNum.nextInt(0, 24));
            
            String s1 = Character.toString(c1);  
            System.out.println(s1 + "s1");
            String s2 = Character.toString(c2);
            System.out.println(s2 + "s2");   
            String s3 = Character.toString(c3);
            System.out.println(s3 + "s3");   
            String s4 = Character.toString(c4);
            System.out.println(s4 + "s4");   
            String s5 = Character.toString(c5);
            System.out.println(s5 + "s5");
            
            String generatedPassword = partOnePassword+s1+s2+s3+s4+s5;
            completePassword = generatedPassword;
            generatedHash = calculateMD5(generatedPassword);
        }

        if (generatedHash.equals(trueHash)) {   
            System.out.println(completePassword + " = Complete Password");
            System.out.println(trueHash + " =  True Hash");
            System.out.println(generatedHash + " =  Generated Hash");
        }
    }    
}
