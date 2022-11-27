package itmo.java.basics.Lab4.Part2;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args){
        int Array[]={1,2,3,4,5};
        int a= Array.length;
        int newArray[]={Array[a-1],2,3,4,Array[0]};
        System.out.println(Arrays.toString(newArray));
    }
}
