// ibrahim mohamed abbass    ID:20216490
import java.util.Scanner;
public class bebo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
     for(int i=1;i<=number;i++){
         int x = input.nextInt();
         int y =input.nextInt();
         int sum=0;
         if(x>y){
             int s=x;
             x=y;
             y=s;
         }
         for(int z=x+1;z<y;z++) {
             if(z%2!=0){
                 sum+=z;}
         }
         System.out.println(sum);}
    }}
