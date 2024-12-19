//Program-RSA

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class RSA{
static Scanner sc = new Scanner(System.in);
public static void main(String [ ] args){
System.out.print("Enter a prime number : ");
BigInteger p = sc.nextBigInteger();
System.out.print("Enter another prime number :");
BigInteger q = sc.nextBigInteger();

BigInteger N = p.multiply(q);

BigInteger n2 = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));

BigInteger e = generateE(n2);

BigInteger d = e.modInverse(n2);

System.out.println("Encryption Keys are: " + e + "," + N);
System.out.println("Decryption Keys are: " + e + "," + N);
}

public static BigInteger generateE( BigInteger phi){

BigInteger e;

Random rand = new Random();
do{
e = new BigInteger(phi.bitLength(), rand);
}
while(e.compareTo(BigInteger.TWO)<=0 ||!phi.gcd(e).equals(BigInteger.ONE));
return e;
}
}