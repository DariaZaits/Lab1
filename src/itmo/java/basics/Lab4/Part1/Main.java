package itmo.java.basics.Lab4.Part1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,22,23,24,25,26,27,28,29,30};

        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i<99; i++) {
            if (i%2==0)
            {
                System.out.println(i);
            }

        }
        System.out.println("Готово");
        for (int i : intArray){
            if (i%2==0)
            {
                System.out.println(i);
            }
        }



    }




}
