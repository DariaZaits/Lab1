package itmo.java.basics.Lab4.Part1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        boolean result= comparing();
        System.out.print(result);
    }
    public static boolean comparing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println("Введите число");
        int b = scanner.nextInt();
        System.out.println("Введите число, которое больше больше двух предыдущих");
        int c = scanner.nextInt();

        if (b>a && c>b ){
            return(true);
        }
        return (false);


    }
}
