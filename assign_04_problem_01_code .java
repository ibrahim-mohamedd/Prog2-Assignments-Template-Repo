// ibrahim mohamed abbass    ID:20216490
import java.util.Scanner;
public class bebo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
       int[]arr=new int[number];
       for(int i=0;i<number;i++){
           arr[i]= input.nextInt();;}
        for(int x=0;x<number;x++){
            if(arr[x]>0){
                System.out.print("1 ");}
            else if (arr[x]<0){System.out.print("2 ");}
                else {
                    System.out.print("0 ");}

            }
        }}