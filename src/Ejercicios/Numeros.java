package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numeros {
    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese el numero");
        Integer numero = ingresarNumero();
       Boolean espar = (numero % 2) == 0;
       if(espar){
           System.out.println("es un numero par");
       }else {
           System.out.println(" no es par" );
       }

    }



        private static Integer ingresarNumero() throws IOException {
            InputStreamReader capturarTeclado = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(capturarTeclado);
            String strANumber = bufferedReader.readLine();
            Integer numbero = Integer.parseInt(strANumber);
            return numbero;

    }
}