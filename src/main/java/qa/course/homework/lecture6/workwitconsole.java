package qa.course.homework.lecture6;

import java.util.Scanner;

public class workwitconsole {
    public static void main(String[] args) {


     {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Your name is:" + name);

        System.out.println("Please enter your hobby");
        String hobby = scanner.nextLine();
        System.out.println("Your hobby is:" + hobby);
    }
}}


