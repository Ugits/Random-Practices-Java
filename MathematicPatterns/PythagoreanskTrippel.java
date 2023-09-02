package MathematicPatterns;


public class PythagoreanskTrippel {
    
    public static void main(String[] args) {
        //A ArrayList for a, b and c
        /* 
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        */
        /* 
        // give the list an range (1,  1000)
        for (int i = 1; i < 1001; i++) {
            a.add(i);
            b.add(i);
            c.add(i);
        } 
        */
        //System.out.println(a.size());

        //köra igenom och arrays och testa värdena mot varandra
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
