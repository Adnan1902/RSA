# RSA Implementation in Java

A simple implementation of the RSA (Rivest-Shamir-Adleman) cryptographic algorithm in Java. This program generates encryption and decryption keys based on user-provided prime numbers.

## Prerequisites
- Java Development Kit (JDK) 8 or higher


## Algorithm Overview
RSA is a public-key cryptosystem that is widely used for secure data transmission. It is based on the practical difficulty of factoring the product of two large prime numbers.

## How it Works
1. Takes two prime numbers (p, q) as input
2. Calculates N = p * q
3. Calculates φ(N) = (p-1) * (q-1)
4. Generates public key (e) where 1 < e < φ(N)
5. Calculates private key (d) using modular multiplicative inverse
6. Outputs the encryption and decryption keys

## Compilation and Execution Steps

bash
# Compile the Java program
javac RSA.java

# Run the program
java RSA


## Usage Example

Enter a prime number : 61
Enter another prime number : 53
Encryption Keys are: 1747,3233
Decryption Keys are: 1747,3233


## Program Structure
java
public class RSA {
    - main(String[] args): Primary method for RSA key generation
    - generateE(BigInteger phi): Helper method to generate public key
}


## Input Requirements
- Two prime numbers (p and q)
- Both numbers should be prime for the algorithm to work correctly

## Features
- Uses BigInteger for handling large numbers
- Random generation of public key (e)
- Automatic calculation of private key (d)
- Input validation for prime numbers

## Common Issues and Solutions
1. "Not a prime number" error
   - Ensure you enter prime numbers only
   
2. "Number too large" error
   - Use smaller prime numbers if you encounter this
