import java.util.Scanner;

public class ReversePalindromeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=num;
        int rev_num=0;
        while(n>0){
            rev_num=rev_num*10+(int)n%10;
            n=(int)n/10;
        }
        if(num==rev_num){
            System.out.println(num + " is a Palindrome");
        }
        else{
            System.out.println(num + " is not a Palindrome");
        }
        sc.close();
    }
}
