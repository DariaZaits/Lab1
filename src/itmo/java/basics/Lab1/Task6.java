package itmo.java.basics.Lab1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите число");
        int v=scanner2.nextInt();
        if (v%2!=0)
        {
            System.out.println("Нечетное");

        }
        else
        {
            if (v>100)
            {
                System.out.println("Выход за пределы");
            }
            else
            {System.out.println("Четное");}

        }
    }
}
