package qa.course.homework.lecture6;

import java.util.Scanner;

public class evenodd
{
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
        System.out.println("Въдедете число");

    int num = Integer.parseInt(scanner.nextLine());
    if (num % 2 == 0){
        System.out.println("четно");}
    else {
        System.out.println("нечетно");}
}
}
