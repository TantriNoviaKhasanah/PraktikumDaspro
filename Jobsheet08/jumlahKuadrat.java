import java.util.Scanner;

public class jumlahKuadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int n = 1; n <= 5; n++) {  
            System.out.print("n = " + n + " -> jumlah kuadrat = ");  
            
            int total = 0; 
            for (int i = 1; i <= n; i++) {  
                System.out.print(i * i);
                total += i * i; 
                
                if (i < n) {
                    System.out.print(" + "); 
                }
            }
            
            System.out.println(" = " + total); 
        }
    }
}

