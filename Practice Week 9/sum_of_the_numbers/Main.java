// Q1. You are provided with an array of numbers and the task is to find triplets in the array which adds up to a given value. If there is such a triplet present in array, then print the triplet.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers to be entered");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers ");
        for(int i = 0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the sum of numbers to be calculated");
        int sum = sc.nextInt();
        outerloop:
        for(int i=0;i<n;i++){
            int a = arr[i];
            for(int j=1;j<n;j++){
                int b = arr[j];
                for(int k=2;k<n;k++){
                    int c = arr[k];
                    int sum1=a+b+c;
                    if(sum1==sum){
                        System.out.println(a+" "+b+" "+c);
                        break outerloop;
                    }
                }
            }
        }
    }
}