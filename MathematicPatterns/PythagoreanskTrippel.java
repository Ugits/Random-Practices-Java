package MathematicPatterns;


public class PythagoreanskTrippel {
    
    public static void main(String[] args) {

        for (int a = 0; a < 950; a++) {
                      
            for (int b = 0; b < 950; b++) {
                              
                for (int c = 0; c < 950; c++) {
                   
                    int sum = a + b + c;
                    if (((a*a)+(b*b) == c*c) && ((a < b) && (b < c))) {
                        
                        if (sum == 950) {
                        
                            System.out.println(a+"");
                            System.out.println(b+"");
                            System.out.println(c+"");
                            
                            int answer = a * b * c;
                            System.out.println(answer);
                           
                        }
                    }
                }
            }
        }
    }
}
