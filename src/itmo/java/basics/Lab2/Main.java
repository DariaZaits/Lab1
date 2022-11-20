package itmo.java.basics.Lab2;

public class Main {
    public static void main(String[] args) {

        Calculator sum = new Calculator();
        sum.sum(10,10);
        sum.sum(10000,500000);
        sum.sum(10.325,50.064);

        Calculator subtract = new Calculator();
        subtract.subtract(10,10);
        subtract.subtract(10000,500000);
        subtract.subtract(10.325,50.064);

        Calculator multiplication = new Calculator();
        multiplication.multiplication(10,10);
        multiplication.multiplication(1000000,600000);
        multiplication.multiplication(110.123,625.003);

        Calculator division =new Calculator();
        division.division(20,60);
        division.division(123456789,987654321);
        division.division(456.456,789.789);

    }
}
