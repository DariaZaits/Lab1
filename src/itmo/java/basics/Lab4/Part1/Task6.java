package itmo.java.basics.Lab4.Part1;

public class Task6 {
    public static void main(String[] args){
        boolean result=search();
        System.out.println(result);
    }
    public static boolean search(){
        int Array[]={4,2,7,4,5,6,7};
        for (int i : Array) {
            if (i == 1 || i == 3) {
                return (true);
            }
        }
            return false;



   }
}
