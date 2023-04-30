//ibrahim mphamed  ID:20216490
import java.util.Scanner;
public class bebo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int fib1 = 0, fib2 = 1;
        for (int i = 1; i <= number; i++) {
           System.out.print(fib1+" ");
            int nextnum = fib1 + fib2;
            fib1=fib2;
            fib2 = nextnum;}
        System.out.println();
    }}