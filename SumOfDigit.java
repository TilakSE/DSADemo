import java.math.BigInteger;
import java.util.*;
class SumOfDigit {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int cases=sc.nextInt();
       BigInteger one = BigInteger.ONE;
       BigInteger nine = BigInteger.valueOf(9);
       for(int i=0;i<cases;i++){
            BigInteger n = sc.nextBigInteger();
            //Formula: 1+(n-1)%9  .No need of while loop
            BigInteger result = one.add(n.subtract(one).mod(nine));
            System.out.println(result);
       }
       sc.close();     
    }
}
