package Crypto_lab;

import java.util.Scanner;

public class Diffie_hellman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diffie-Hellman Key Exchange Algorithm");

        // Input prime number (p) and primitive root (g)
        System.out.print("Enter a large prime number (p): ");
        int p = scanner.nextInt();
        System.out.print("Enter a primitive root modulo p (g): ");
        int g = scanner.nextInt();

        // Party A's private key
        System.out.print("Party A, enter your private key (a): ");
        int a = scanner.nextInt();
        int A = modularExponentiation(g, a, p); // Compute public key A
        System.out.println("Party A's public key (A): " + A);

        // Party B's private key
        System.out.print("Party B, enter your private key (b): ");
        int b = scanner.nextInt();
        int B = modularExponentiation(g, b, p); // Compute public key B
        System.out.println("Party B's public key (B): " + B);

        // Shared key computation
        int sharedKeyA = modularExponentiation(B, a, p); // Key computed by Party A
        int sharedKeyB = modularExponentiation(A, b, p); // Key computed by Party B

        System.out.println("\nShared Key Computed by Party A: " + sharedKeyA);
        System.out.println("Shared Key Computed by Party B: " + sharedKeyB);

        if (sharedKeyA == sharedKeyB) {
            System.out.println("The shared keys match! Secure communication established.");
        } else {
            System.out.println("Error: Shared keys do not match.");
        }

        scanner.close();
    }
    public static int modularExponentiation(int base, int exponent, int mod) {
        int result = 1;
        base = base % mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            exponent >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }
}
