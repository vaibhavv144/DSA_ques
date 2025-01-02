package Crypto_lab;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class RSA_digital_sig {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Key Generation
        System.out.print("Enter the first prime number (p): ");
        BigInteger p = scanner.nextBigInteger();
        System.out.print("Enter the second prime number (q): ");
        BigInteger q = scanner.nextBigInteger();

        BigInteger n = p.multiply(q); // n = p * q
        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE)); // φ(n)

        // Choose public key e
        BigInteger e;
        do {
            e = new BigInteger(phi.bitLength(), new java.util.Random());
        } while (e.compareTo(BigInteger.ONE) <= 0 || e.compareTo(phi) >= 0 || !e.gcd(phi).equals(BigInteger.ONE));

        // Compute private key d
        BigInteger d = e.modInverse(phi);

        System.out.println("\nKey Generation:");
        System.out.println("Public Key (e, n): (" + e + ", " + n + ")");
        System.out.println("Private Key (d, n): (" + d + ", " + n + ")");

        // Step 2: Input Message
        System.out.print("\nEnter the message to sign: ");
        scanner.nextLine(); // Consume newline
        String message = scanner.nextLine();

        // Step 3: Compute Message Hash
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] messageHash = md.digest(message.getBytes());
        BigInteger messageDigest = new BigInteger(1, messageHash);

        System.out.println("Message Digest (Hash): " + messageDigest);

        // Step 4: Generate Signature
        BigInteger signature = messageDigest.modPow(d, n); // S = H(M)^d mod n
        System.out.println("Generated Digital Signature: " + signature);

        // Step 5: Signature Verification
        BigInteger verifiedHash = signature.modPow(e, n); // H(M) = S^e mod n
        System.out.println("Verified Hash: " + verifiedHash);

        if (messageDigest.equals(verifiedHash)) {
            System.out.println("Signature is valid. The message is authentic.");
        } else {
            System.out.println("Signature is invalid. The message may have been tampered with.");
        }

        scanner.close();
    }
}
