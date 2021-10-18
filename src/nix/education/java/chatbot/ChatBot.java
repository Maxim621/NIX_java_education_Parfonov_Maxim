package nix.education.java.chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;

        System.out.println("Hello! My name is Jarvis.\nI was created in 2021.\nPlease, remind me your name.");


        while (true) {
            response = scanner.nextLine();
            if (response.equals("Maxim")) {
                System.out.println("What a great name you have, Maxim!");
                break;
            }
        }

        System.out.println("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.");

        int age = 0;
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        while (true) {
            response = scanner.nextLine();
            if (response.equals("")) {
                age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
                System.out.println("Your age is " + age + ";" + " that's a good time to start programming!");
                break;
            }
        }

        System.out.println("Now I will prove to you that I can count to any number you want.");

        int counter = scanner.nextInt();

        for (int i = 0; i <= counter; i++) {
            System.out.println(i + " !");
        }

        System.out.println("Let's test your programming knowledge.\nWhat will the next program output?\n" +
                "Integer i1 = 10;\nInteger i2 = 10;\nSystem.out.println(i1 == i2);\nSystem.out.println(i1 == 10);\n" +
                "1. true true.\n2. true false.\n3. false false.\n4. false true.");

        do {
            response = scanner.nextLine();
            switch (response) {
                case "1":
                    System.out.println("Great, you right!\nGoodbye, have a nice day!");
                    System.exit(0);
                    break;
                case "2":
                    System.out.println("Please, try again.");
                    break;
                case "3":
                    System.out.println("Please, try again.");
                    break;
                case "4":
                    System.out.println("Please, try again.");
                    break;
            }
        } while (true);
    }
}