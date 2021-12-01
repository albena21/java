package qa.course.homework.lecture6;

import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Въдедете число от 1-7");

    Scanner scanner = new Scanner(System.in);
    int num = Integer.parseInt(scanner.nextLine());

if (num == 1) {
        System.out.println("понеделник");
    } else if (num == 2) {
        System.out.println("вторник");
    } else if (num == 3) {
    System.out.println("сряда");
    }else if (num == 4) {
    System.out.println("Четвъртък");
    }else if (num == 5) {
    System.out.println("Петък");
    }else if (num == 6) {
    System.out.println("Събота");
    } else if (num == 7) {
        System.out.println("Неделя");
    } else {
        System.out.println("Незнам");
    }
}}
