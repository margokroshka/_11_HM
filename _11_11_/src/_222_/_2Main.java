package _222_;

import java.util.Scanner;

public class _2Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Password=sc.nextLine();
        String confirmPassword=sc.nextLine();
        String Login=sc.nextLine();

        try {
            PasswordUtil.process(Password, confirmPassword);
            System.out.println("true");
        } catch (WrongPasswordException e) {
            System.out.println("false");  
            System.out.println(e.getMessage());

        }

        try {
            LoginUtil.process(Login);
            System.out.println("true");
        } catch (WrongLoginException e) {
            System.out.println("false");
            System.out.println(e.getMessage());

        }
    }
}
