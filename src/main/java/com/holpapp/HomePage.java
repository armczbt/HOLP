package com.holpapp;
import java.util.Scanner;

public class HomePage {
    public HomePage(){
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to HOLP");

        while (true) {
            System.out.println("1. Sign Up");
            System.out.println("2. Log In");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Option Sign Up chosen.");
                    // Open the registration form
                    RegisterForm registerForm = new RegisterForm();
                    registerForm.setVisible(true);
                    break;
                case 2:
                    System.out.println("Option Log In chosen.");
                    // Open the login form
                    LoginForm loginForm = new LoginForm();
                    loginForm.setVisible(true);
                    break;
                case 3:
                    System.out.println("Thank you for using the application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please enter 1, 2, or 3.");
            }
        }
    }


}
