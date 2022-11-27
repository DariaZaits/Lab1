package itmo.java.basics.Lab4.Part2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int sizeArray = scanner.nextInt();
        int Array[]= new int[sizeArray];
        System.out.println("Введите числа массива");
        for(int i=0; i< sizeArray; i++){
            Scanner inputArray = new Scanner(System.in);
            Array[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(Array));


    }

}
