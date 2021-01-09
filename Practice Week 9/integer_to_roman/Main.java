import java.util.Scanner;

//Q3) Write an efficient program that takes integer as input and convert a given integer into an equivalent Roman numeral. (Check it in integer range 0 to 1000.)
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
		System.out.println(intToRoman(number));
    }
    static String intToRoman(int num) 
	{ 
		String m[] = {"", "M", "MM", "MMM"};
		String c[] = {"", "C", "CC", "CCC", "CD", "D","DC", "DCC", "DCCC", "CM"};
		String x[] = {"", "X", "XX", "XXX", "XL", "L","LX", "LXX", "LXXX", "XC"};
		String i[] = {"", "I", "II", "III", "IV", "V","VI", "VII", "VIII", "IX"};
		String thousands = m[num/1000];
		String hundereds = c[(num%1000)/100];
		String tens = x[(num%100)/10];
		String ones = i[num%10];
			
		String ans = thousands + hundereds + tens + ones;
			
		return ans;
	}
}
