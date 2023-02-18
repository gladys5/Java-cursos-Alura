package primerosPasosJava;

public class factorial {
    public static void main(String[] args) {
        int factory = 1;
        for (int i = 1; i < 11; i++) {
            factory *= i;
            System.out.println("Factorial de " + i + " = " + factory);
        }


    }
}