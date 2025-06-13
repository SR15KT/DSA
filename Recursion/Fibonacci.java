//Nth element in a fibonacci series
public class FibonacciRecursion {
    public static void main(String[] args) {
        int ans= fibonacci(4);
        System.out.println(ans);
    }
    public static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}



// Fibonacci series
import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=0;i<n;i++){
        System.out.print(fibonacci(i)+" " );
    }}
     static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}

