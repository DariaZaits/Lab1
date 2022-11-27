package itmo.java.basics.Lab4.Part1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        boolean result= comparing();
        System.out.println(result);


    }
    public static boolean comparing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println("Введите число");
        int b = scanner.nextInt();
        System.out.println("Сумму чисел");
        int c = scanner.nextInt();
        int d = a + b;

        if (c==d){
            return(true);
            }
        return (false);


    }
}
