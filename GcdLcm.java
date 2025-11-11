import java.util.*;
class GcdLcm {
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static int lcm(int a,int b){
        if(a==0 || b==0){
            return 0;
        }
        return a*b/gcd(a,b);
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println("gcd "+gcd(num1,num2));
            System.out.println("lcm "+lcm(num1,num2));
        }
        sc.close();
    }
}
