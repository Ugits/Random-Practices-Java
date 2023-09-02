package MathematicPatterns;

public class Fibonacci {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int result = 0;
        int answer = 0;
        int cap = 2000000;
        int antalUträkningar = 0;

        while (result <= cap) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
            
            
            if (result > cap) {
                break;
            }
            System.out.println(result);
            
            if (result % 2 == 0) {
                answer += result;
            }
            antalUträkningar++;

        }
        System.out.println(answer+ " Svaret"); // 1089154
        System.out.println(antalUträkningar);  // 30
            
    }
}
