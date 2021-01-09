
//write a program where each column represents same number according to given example:
// to form a pattern 
import java.util.Scanner;

class Main {
    static void display(int n) {
        int space = n / 2, number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            int count = number / 2 + 1;
            for (int k = 1; k <= number; k++) {
                System.out.print(count);
                if (k <= number / 2)
                    count--;
                else
                    count++;
            }
            System.out.println();
            if (i <= n / 2) {
                space = space - 1;
                number = number + 2;
            }
            else {
                space = space + 1;
                number = number - 2;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the odd number for the diamond shape ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        display(num);
        sc.close();
    }
}
