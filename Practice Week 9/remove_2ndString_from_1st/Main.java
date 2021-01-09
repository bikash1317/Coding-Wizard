import java.util.Scanner;

//Q2. Write an efficient program that takes two strings as arguments and removes the characters from the first string, which are present in the second string.
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String s1 = sc.nextLine();
        System.out.println("Enter the second String");
        String s2 = sc.nextLine();
        String s3[] = s2.split("");
        for(int i = 0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                String s4 =Character.toString(s1.charAt(i)) ;
                if(s4.equalsIgnoreCase(s3[j])){
                    s1=charRemoveAt(s1, i);
                }
            }
        }
        System.out.println(s1);

    }
    public static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);  
     }
}