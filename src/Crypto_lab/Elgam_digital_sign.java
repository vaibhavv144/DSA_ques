package Crypto_lab;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Elgam_digital_sign {
    public static void main(String[] args) throws Exception {

            // Parameters
            SecureRandom random = new SecureRandom();
            BigInteger p = new BigInteger("467"); // A large prime
            BigInteger g = new BigInteger("2");  // A generator for the group

            // Key Generation
            BigInteger x = new BigInteger("127"); // Private key
            BigInteger y = g.modPow(x, p);        // Public key

            System.out.println("Public Key: (p=" + p + ", g=" + g + ", y=" + y + ")");
            System.out.println("Private Key: x=" + x);

            // Message
            String message = "Hello how are you";
            BigInteger h = hashMessage(message); // Hash of the message
            System.out.println("Message Hash: " + h);

            // Signing
            BigInteger k;
            do {
                k = new BigInteger(p.bitLength() - 1, random); // Random k
            } while (!k.gcd(p.subtract(BigInteger.ONE)).equals(BigInteger.ONE));

            BigInteger r = g.modPow(k, p);
            BigInteger kInverse = k.modInverse(p.subtract(BigInteger.ONE));
            BigInteger s = kInverse.multiply(h.subtract(x.multiply(r))).mod(p.subtract(BigInteger.ONE));

            System.out.println("Signature: (r=" + r + ", s=" + s + ")");

            // Verification
            BigInteger v1 = (y.modPow(r, p).multiply(r.modPow(s, p))).mod(p);
            BigInteger v2 = g.modPow(h, p);

            System.out.println("Verification: " + (v1.equals(v2) ? "Valid" : "Invalid"));
        }

        // Hash function (simulates a hash using BigInteger representation of the message)
        public static BigInteger hashMessage(String message) {
            return new BigInteger(1, message.getBytes());
        }
}
