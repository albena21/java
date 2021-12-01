package qa.course.homework.lecture6;

public class compare {
    public static void main( String args[] ) {
        compare(26, 65, 20);
    }
    public static void compare(int a, int b, int c){
        if (a > b && a > c){
            System.out.println("Първото число е по голямо");
        } else if(b > a && b > c){
            System.out.println("Второто число е по голямо");
            }else if (c > a && c > b){
            System.out.println("Третото число е по голямо");
    }
}
}

