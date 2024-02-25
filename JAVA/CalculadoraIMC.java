import java.util.Scanner;

public class CalculadoraIMC {
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su peso en kilogramos
        System.out.println("Ingrese su peso en kilogramos");
        double peso = scanner.nextDouble(); // Leer el peso ingresado por el usuario

        // Solicitar al usuario que ingrese su altura en metros
        System.out.println("Ingrese su altura en metros (por ejemplo, 1.80):");
        double altura = scanner.nextDouble(); // Leer la altura ingresada por el usuario

        // Calcular el índice de masa corporal (IMC) utilizando la fórmula: peso / (altura * altura)
        double imc = peso / (altura * altura);

        // Mostrar el IMC calculado en la consola
        System.out.println("Tu índice de masa corporal es " + imc);

        // Determinar la clasificación del IMC
        String clasificacion;
        if (imc < 18.5) {
            clasificacion = "Bajo peso";
        } else if (imc >= 18.5 && imc < 25) {
            clasificacion = "Normal";
        } else if (imc >= 25 && imc < 30) {
            clasificacion = "Sobrepeso";
        } else {
            clasificacion = "Obeso";
        }
        
        // Mostrar la clasificación del IMC en la consola
        System.out.println("Clasificación: " + clasificacion);

        // Cerrar el objeto Scanner para liberar los recursos
        scanner.close();
    }
}
