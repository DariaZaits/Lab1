package itmo.java.basics.Lab4.Part2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args){
        int Array[]={1,2,3,5,4,7,0,11,10};
        int newArray[]= {1,2,3,5,4,7,0,11,10};
        Arrays.sort(newArray);
        if (Arrays.equals(Array,newArray)){
            System.out.println("OK");
        }
        else {
            System.out.println("Please,try again");
        }


    }
}
