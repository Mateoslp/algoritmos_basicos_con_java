package Actividad_2;

import java.util.Scanner;

public class CalculadoraRadioCilindro {
    public static void main(String[]args) {
        //Se ingresa el volumen del cilindro
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar el volumen del cilindro");
        double volumen= scanner.nextDouble();

        //se ingresa la altura del cilindro
        System.out.println("Ingrese la altura del cilindro");
        double altura=scanner.nextDouble();

        //Calcular radio del cilindro
        double radio = Math.sqrt(volumen/(Math.PI*altura));

        //mostrar el resultado
        System.out.println("El radio del cilindro es: " + radio);

        scanner.close();
    }
}
