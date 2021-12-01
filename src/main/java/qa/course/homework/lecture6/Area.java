package qa.course.homework.lecture6;

import java.util.Scanner;

public class Area {
    public static void main( String args[] )
    {

        Scanner input = new Scanner(System.in);
        int a;
        int b;


        System.out.print( "Въведи ширина: " );
        a = input.nextInt();

        System.out.print( "Въведи височина: " );
        b = input.nextInt();
        int area = a * b;
        System.out.print("квадратура = ");
        System.out.println(area);
        int perimetar = 2 * a + 2 * b;
        System.out.print("периметър = ");
        System.out.println(perimetar);

    }}



