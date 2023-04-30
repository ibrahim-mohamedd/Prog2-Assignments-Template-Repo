// ibrahim mohamed abbass    ID:20216490
import java.util.Scanner;
public class bebo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
     for(int i=1;i<=number;i++){
         int x = input.nextInt();
         int y =input.nextInt();
         if(x%2==0){
             x+=1;}
         int sum=0;
         for(int z=0;z<y;z++) {
             sum += x;
             x += 2;
         }
         System.out.println(sum);}
    }}