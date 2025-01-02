package Crypto_lab;

import java.math.BigInteger;
import java.security.SecureRandom;

public class ElGamal {
    private BigInteger p; // Large prime
    private BigInteger g; // Primitive root modulo p
    private BigInteger privateKey; // Private key
    private BigInteger publicKey; // Public key

    public ElGamal(int bitLength) {
        SecureRandom random = new SecureRandom();

        // Generate a large prime number p
        p = BigInteger.probablePrime(bitLength, random);

        // Generate a primitive root modulo p
        g = BigInteger.valueOf(2); // Simplified choice for g

        // Generate private key (1 < privateKey < p-1)
        privateKey = new BigInteger(bitLength - 1, random)
                .mod(p.subtract(BigInteger.ONE))
                .add(BigInteger.ONE);

        // Generate public key: publicKey = g^privateKey mod p
        publicKey = g.modPow(privateKey, p);
    }

    public BigInteger[] encrypt(BigInteger message) {
        SecureRandom random = new SecureRandom();

        // Generate random k (1 < k < p-1)
        BigInteger k = new BigInteger(p.bitLength() - 1, random)
                .mod(p.subtract(BigInteger.ONE))
                .add(BigInteger.ONE);

        // Calculate c1 = g^k mod p
        BigInteger c1 = g.modPow(k, p);

        // Calculate c2 = message * (publicKey^k mod p) mod p
        BigInteger c2 = message.multiply(publicKey.modPow(k, p)).mod(p);

        return new BigInteger[]{c1, c2};
    }

    public BigInteger decrypt(BigInteger[] cipher) {
        BigInteger c1 = cipher[0];
        BigInteger c2 = cipher[1];

        // Calculate shared secret: s = c1^privateKey mod p
        BigInteger s = c1.modPow(privateKey, p);

        // Calculate message: message = (c2 * s^-1) mod p
        BigInteger sInverse = s.modInverse(p);
        return c2.multiply(sInverse).mod(p);
    }

    public BigInteger getPublicKey() {
        return publicKey;
    }

    public BigInteger getP() {
        return p;
    }

    public BigInteger getG() {
        return g;
    }

    public static void main(String[] args) {
        // Initialize the ElGamal system with a bit length for prime number
        int bitLength = 512;
        ElGamal elGamal = new ElGamal(bitLength);

        // Display public parameters
        System.out.println("Public parameters:");
        System.out.println("Prime (p): " + elGamal.getP());
        System.out.println("Generator (g): " + elGamal.getG());
        System.out.println("Public Key: " + elGamal.getPublicKey());

        // Message to encrypt (as a number)
        BigInteger message = new BigInteger("123456789");
        System.out.println("\nOriginal Message: " + message);

        // Encrypt the message
        BigInteger[] cipher = elGamal.encrypt(message);
        System.out.println("\nEncrypted Message:");
        System.out.println("c1: " + cipher[0]);
        System.out.println("c2: " + cipher[1]);

        // Decrypt the message
        BigInteger decryptedMessage = elGamal.decrypt(cipher);
        System.out.println("\nDecrypted Message: " + decryptedMessage);
    }
}
