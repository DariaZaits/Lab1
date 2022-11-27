package itmo.java.basics.Lab4.Part1;

public class Task5 {
    public static void main(String[] args){
        boolean result= compare();
        System.out.println(result);

    }
    public static boolean compare(){
        int Array[]={3,3,3,3,3,3,3,2};
        for(int i : Array) {
            if (Array[0] == 3 || Array[7] == 3) {
                return (true);
            }
        }
        return (false);


    }
}
