
package Midterm;


public class FibonacciRecursive {
    
    public static int f(int n) {
        if (n<=1) {
            return n;
          
        }
        return f(n - 1) + f(n-2);
    }
    public static void main(String[] args ) {
        int n = 10;
        
        for (int i  = 0; i <n; i++){
            System.out.print(f(i) + ", ");
        }
    }
}
    

//
//public static void main(String [] args) {
//    int n = 10;
//    int first = 0, second =1;
//    
//    System.out.print(first + " " + second + " ");
//    for (int i = 2; i < n; i++) {
//        int next = first + second;
//        System.out.print(next + " ");
//        first = second;
//        second = next;
//         
//    }
//}
