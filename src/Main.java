public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Calc calc = new Calc();
        System.out.println(calc.add(10,5));
        System.out.println(calc.mul(10,5));
        System.out.println(calc.sub(10,5));
        System.out.println(calc.dev(10,5));
        System.out.print(calc.module(12,5));
    }
}