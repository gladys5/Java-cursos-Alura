package primerosPasosJava;

public class Main {
    public static void main(String[] args) {
        for(int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
             if (columna > fila){
               break;
             }
                System.out.print( columna +1);
            }
            System.out.println();
        }


    }


}