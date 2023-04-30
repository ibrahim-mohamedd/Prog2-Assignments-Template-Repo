// ibrahim mohamed abbass    ID:20216490
import java.util.Scanner;
public class bebo
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 1; i<= number; i++) {
            for (int st = number; st >= i; st--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }}
