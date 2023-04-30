// ibrahim mohamed abbass    ID:20216490
import java.util.Scanner;
public class bebo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
      for(int i=0;i<number;i++) {
          int y = input.nextInt();
          int[] arr = new int[y];
          for (int n = 0; n < y; n++) {
              arr[n] = input.nextInt();
          }
          int minsum = Integer.MAX_VALUE;
          for (int n = 0; n < y; n++) {
              for (int z = 0; z < n; z++) {
                  int sum = arr[n] + arr[z] + n - z;
                  if (sum < minsum) {
                      minsum = sum;
                  }
              }
          }

          System.out.println(minsum);
      }
    }}