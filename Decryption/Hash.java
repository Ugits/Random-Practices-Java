package Decryption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class Hash {
    
    public static String calculateMD5(String input){
        /**
         * Calculates the MD5 hash of the input string
         */
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

    
    /* 
     
    static String getLetter(int num){
        
        String c = abc.substring(num, num +1);
        return c;
    }
    
    */
    
    public static String abc = "abcdefghijklmnopqrstuvwxyz";
    
    public static void main(String[] args) {
        
        // alphabet
        // Hashes
        String oldHash = "0CF2FCF4598769F395B7CC0528C09C0E";
        String newHash = "";
      
        
        // Strings
        String partOnePassword = "AdaLovelace-";
        char c1;
        char c2;
        char c3;
        char c4;
        char c5;


        while (!newHash.equals(oldHash)) {
            
            System.out.println("*");
            Random randomNum = new Random();
            
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
            
            String fullSentence = partOnePassword+s1+s2+s3+s4+s5;
            System.out.println(fullSentence + "    fullSentence");
            newHash = calculateMD5(fullSentence);
            
        }
        
        if (newHash.equals(oldHash)) {
            
            System.out.println(oldHash + "  old hash");
            System.out.println(newHash + "  newHash");
            
        }

        
    }    
}
    /*
     * matte
     * 
     * program works
     * but does not print inside IF block
     * if the statment is 
     * (newHash == oldHash)   ?????????????????+
     */
        

            
            
            
            /* RUNS
                35,57 s
                
            
                */
        
        
    
            
        

       
        
        
        
        

    
        

        
        
      

    
        
        
        