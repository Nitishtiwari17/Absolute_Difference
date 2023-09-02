package mathPackage;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length:");
        int length=sc.nextInt();
        System.out.println("enter the array value:");
        int arr[]=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the num:");
        int num=sc.nextInt();
        System.out.println("enter the diff:");
        int diff=sc.nextInt();
        absolute_difference(arr,length,num,diff);
    }
    static void absolute_difference(int arr[], int length, int num, int diff) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (Math.abs(arr[i] - num) <= diff) {
                count++;
            }
        }
        System.out.println(count);
    }
}

