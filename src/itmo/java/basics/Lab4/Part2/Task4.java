package itmo.java.basics.Lab4.Part2;

public class Task4 {
    public static void main(String[] args){
       int Array[]={1,2,2,1,5,5,5};
         if (Array[0]!=Array[1] && Array[0]!=Array[2] && Array[0]!=Array[3] && Array[0]!=Array[4] && Array[0]!=Array[5] && Array[0]!=Array[6]){
             System.out.println(Array[0]);
         }
         else {
             if (Array[1]!=Array[0] && Array[1]!=Array[2] && Array[1]!=Array[3] && Array[1]!=Array[4] && Array[1]!=Array[5] && Array[1]!=Array[6]){
                 System.out.println(Array[1]);
             }
             else {
                 if(Array[2]!=Array[0] && Array[2]!=Array[1] && Array[2]!=Array[3] && Array[2]!=Array[4] && Array[2]!=Array[5] && Array[2]!=Array[6]){
                     System.out.println(Array[2]);
                 }
                 else{
                     if(Array[3]!=Array[0] && Array[3]!=Array[1] && Array[3]!=Array[2] && Array[3]!=Array[4] && Array[3]!=Array[5] && Array[3]!=Array[6]){
                         System.out.println(Array[3]);
                     }
                     else {
                         if(Array[4]!=Array[0] && Array[4]!=Array[1] && Array[4]!=Array[2] && Array[4]!=Array[3] && Array[4]!=Array[5] && Array[4]!=Array[6]){
                             System.out.println(Array[4]);
                         }
                         else {
                             if(Array[5]!=Array[0] && Array[5]!=Array[1] && Array[5]!=Array[2] && Array[5]!=Array[3] && Array[5]!=Array[4] && Array[5]!=Array[6]){
                                 System.out.println(Array[5]);
                             }
                             else {
                                 if(Array[6]!=Array[0] && Array[6]!=Array[1] && Array[6]!=Array[2] && Array[6]!=Array[3] && Array[6]!=Array[4] && Array[6]!=Array[5]){
                                     System.out.println(Array[6]);

                                 }
                                 else {
                                     System.out.println("Уникальных аргументов нет");
                                 }
                             }
                         }
                     }
                 }
             }


       }


    }
}
