import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isPrime=true;
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        int n=sc.nextInt();
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                arr.add(i);
                isPrime=false;
                if(i!=(int)n/i){
                    arr.add((int)n/i);
                }
            }
        }
        if(isPrime){
            System.out.println(n + " is a prime number.");
        }
        else{
            Collections.sort(arr);
            System.out.println(arr); // Print the factors
        }
        sc.close();
    }
}
