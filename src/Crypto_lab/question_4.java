package Crypto_lab;

import java.util.Scanner;

public class question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the plaintext message (lowercase, no numbers/special characters):");
        String plaintext = sc.nextLine();

        if (!isValidPlaintext(plaintext)) {
            System.out.println("Invalid plaintext! Only lowercase letters and spaces are allowed.");
            return;
        }

        System.out.print("Enter the initial key (0-25): ");
        int key = sc.nextInt();
        if (key < 0 || key > 25) {
            System.out.println("Invalid key! Enter a value between 0 and 25.");
            return;
        }

        // Encryption
        String ciphertext = encrypt(plaintext, key);
        System.out.println("Encrypted Ciphertext: " + ciphertext);

        // Decryption
        String decryptedText = decrypt(ciphertext, key);
        System.out.println("Decrypted Text: " + decryptedText);

        // Brute Force
        System.out.println("Brute Force Attack Results:");
        bruteForce(ciphertext);

        sc.close();
    }

    // Function to validate plaintext
    public static boolean isValidPlaintext(String text) {
        return text.matches("[a-z ]+");
    }

    // Encryption Function
    public static String encrypt(String plaintext, int key) {
        StringBuilder ciphertext = new StringBuilder();
        for (char ch : plaintext.toCharArray()) {
            if (ch == ' ') {
                ciphertext.append(' '); // Preserve spaces
            } else {
                char encryptedChar = (char) ((ch - 'a' + key) % 26 + 'A');
                ciphertext.append(encryptedChar);
            }
        }
        return ciphertext.toString();
    }

    // Decryption Function
    public static String decrypt(String ciphertext, int key) {
        StringBuilder plaintext = new StringBuilder();
        for (char ch : ciphertext.toCharArray()) {
            if (ch == ' ') {
                plaintext.append(' '); // Preserve spaces
            } else {
                char decryptedChar = (char) ((ch - 'A' - key + 26) % 26 + 'a');
                plaintext.append(decryptedChar);
            }
        }
        return plaintext.toString();
    }

    // Brute Force Function
    public static void bruteForce(String ciphertext) {
        for (int key = 0; key < 26; key++) {
            StringBuilder decryptedText = new StringBuilder();
            for (char ch : ciphertext.toCharArray()) {
                if (ch == ' ') {
                    decryptedText.append(' ');
                } else {
                    char decryptedChar = (char) ((ch - 'A' - key + 26) % 26 + 'a');
                    decryptedText.append(decryptedChar);
                }
            }
            System.out.println("Key " + key + ": " + decryptedText.toString());
        }
    }
    }
