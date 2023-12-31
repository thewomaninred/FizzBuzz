/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuzz;

import java.util.Random;

/**
 *
 * @author Vale
 */
public class FizzBuzz {
    
    public static String probarNro(int nro) {
        String valor="";
        if (nro%3==0) {
            valor=nro+" fizz";
        }
        if (nro%5==0) {
            if (!valor.equals("")) {
                valor=nro+" fizzbuzz";
            } else {
             valor=nro+" buzz";   
            }
        }
        if (valor.equals("")) {
//            valor=Integer.toString(nro);
            valor=Integer.toString(nro);
        }
        
        return valor;
    }

    public static int generarAleatorios() {

        //generador de numeros aleatorios
        Random generadorAleatorios = new Random();

        //genera un numero entre 1 y 5 y lo guarda en la variable numeroAleatorio
        int numeroAleatorio = 1 + generadorAleatorios.nextInt(100);
        //imprimo el numero en consola
//        System.out.println("Aleatorio generado "+numeroAleatorio);
//        System.out.println(numeroAleatorio);
        return numeroAleatorio;

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 500; i++) {
            System.out.println(probarNro(generarAleatorios()));
        }
    }
    
}
