// ibrahim mohamed abbass    ID:20216490

import java.util.Scanner;
public class bebo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
     int arr[]=new int[number];
     for(int i=0;i<number;i++){
         arr[i]=input.nextInt();
     }
        int x= input.nextInt();
     int neg=-1;
     for(int i=0;i<number;i++){
         if (arr[i]==x){
             neg=i;
             break;
         }

     }

        System.out.println(neg);
    }}