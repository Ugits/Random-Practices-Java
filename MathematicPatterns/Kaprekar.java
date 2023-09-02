package MathematicPatterns;
import java.util.ArrayList;
import java.util.Collections;

public class Kaprekar {
    
    static int iteration = 0;
    
    static ArrayList<Integer> separateDigits(int number) {
        if (iteration == 0) {
            System.out.println(number);         // print
            iteration++;
        }
            
        ArrayList<Integer> digits = new ArrayList<>();

        while (number > 0) {
            //Extract digits using modulo
            int digit = number % 10;
            // Add the digit to the ArrayList
            digits.add(digit);
            //integer division
            number /= 10;           
        }
        return digits;
    }

    // Subtract smallest from biggest combination of digits
    static int subtractBigSmall(ArrayList<Integer> digits){
        
        // digits in order for smallest num
        Collections.sort(digits);
        
        // Unite to one int
        int smallest = uniteDigits(digits);
        
        // revers for biggest num
        Collections.reverse(digits);
        
        // Unite to one int
        int biggestTemp = uniteDigits(digits);
        int biggest = checkNumOfDigits(biggestTemp);
        
        System.out.println(biggest + "-" + smallest);   // print
        System.out.println(biggest - smallest);         // print
        iteration++;
        // calc new number
        return biggest - smallest;
    }

    static int reversInt(int number){
        
        // Convert the int to a String
        String originalString = Integer.toString(number);

        // Reverse the characters of the String
        StringBuilder reversedStringBuilder = new StringBuilder(originalString).reverse();
        String reversedString = reversedStringBuilder.toString();

        // Convert the reversed string back to int
        int reversedNumber = Integer.parseInt(reversedString);
        System.out.println(reversedNumber + "REVERSED NUMBER");
        return reversedNumber;
    }


    static int uniteDigits(ArrayList<Integer> digits){
        //unite digits
        int unitedNumbers = 0;
        for (int digit : digits) {
            unitedNumbers = unitedNumbers * 10 + digit;
        }
        return unitedNumbers;
    }
    
    
    static int checkNumOfDigits(int number){
        
        // int to string to be able to use .length
        String numStr = Integer.toString(Math.abs(number));
        int numOfDigits = 0;
        // "4" is the number of digits we want
        int i = 0;
        while ((numOfDigits != 4) && (i < 50)) {     
            // int to string to be able to use .length
            numStr = Integer.toString(Math.abs(number));   
            // check number of digits
            numOfDigits = numStr.length();
            
            if (numOfDigits < 4) {
                number *= 10;
            }if (numOfDigits > 4){
                number /= 10;
            }
            i++;
        }
        return number;        
    }
    
    static void getIterations(ArrayList<Integer> digits){
                
        int newNum = subtractBigSmall(digits); // first new num
        int numOfKaprekar = 0;
        while (newNum != 6174 && iteration < 50 || numOfKaprekar != 2) {
            
            // new list of separated digits
                digits = separateDigits(newNum);    
                // all new num, exept first
                newNum = subtractBigSmall(digits);
                if (newNum == 6174) {
                    numOfKaprekar++;
                } 
        }
    }

    public static int addDigitToInt(int number, int digit) {
        // Convert the integer to a string and concatenate the digit
        String newNumberStr = Integer.toString(number) + Integer.toString(digit);

        // Convert the new string back to an integer
        int newNumber = Integer.parseInt(newNumberStr);

        return newNumber;
    }   
    
    
    public static int kaprekarIterations(int... numbers){
        /*  Enter your 4 digit number to return number of iterations 
            until you get to Kaprekars Constant. */ 
        int sumIteration = 0;
        for (int num : numbers) {
            
            iteration = 0;
            // get a List of separated digits
            ArrayList<Integer> digits = separateDigits(num);
            // Calc Kaprekars constant and get Iterations
            getIterations(digits);
            // Print final iteration
            System.out.println(iteration);      // print
            sumIteration = addDigitToInt(sumIteration, iteration);
        }
        return sumIteration;
    }

    // Counter
    
    public static void main(String[] args) {
       
        int sumIteration = kaprekarIterations(1917, 7430, 8833, 9998);
        System.out.println(sumIteration);
    }
    
        
}
                
/* 
1917, 7430, 8833, 
1917
7430  
8833  
9998
*/
        
            
        

                    
            
    
        

       
        


        


