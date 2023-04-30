// ibrahim mohamed abbass    ID:20216490
import java.util.Scanner;
public class bebo
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int size = input.nextInt();
        int[]arr=new int [size];
        for(int i=0;i<size;i++){
            arr[i]= input.nextInt();}

        for(int y=0;y<size;y++) {
            boolean prime=true;
            for (int x = 2; x <= arr[x]; x++) {
                if (arr[x]%y==0)
                {
                    prime=false;
                    break;
                }
                }
                  if (prime)
                      System.out.println("Prime");
                  else
                      System.out.println("Not");}

        }

