package Actividad_2;

import java.util.Scanner;

public class SolucionProblemas {
    
    // Método principal donde se ejecuta el programa
    public static void main(String[] args) {
        // Instanciamos la clase Scanner para obtener entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);

        // Instanciamos la clase SolucionProblemas para acceder a sus métodos
        SolucionProblemas solucion = new SolucionProblemas();
        
        int opcion;
        // Bucle para mostrar el menú y permitir al usuario elegir una opción
        do {
            // Mostrar el menú en la consola
            System.out.println("Menú:");
            System.out.println("1. Conversor de Dólar a Peso");
            System.out.println("2. Calcular el valor de venta de un producto");
            System.out.println("3. Calcular el voltaje (V) dados la corriente (I) y la resistencia (R)");
            System.out.println("4. Calcular la velocidad (v) dados la distancia (d) y el tiempo (t)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            // Según la opción seleccionada por el usuario, llamar al método correspondiente
            switch (opcion) {
                case 1:
                    solucion.conversorDolarPeso();
                    break;
                case 2:
                    solucion.valorDeUnProducto();
                    break;
                case 3:
                    solucion.formulaDelVoltaje();
                    break;
                case 4:
                    solucion.formulaDeVelocidad();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcion != 0); // El bucle continúa hasta que el usuario selecciona la opción 0
        
        // Cerrar el objeto Scanner para liberar los recursos
        scanner.close();
    }

    // Método para convertir dólares a pesos
    public void conversorDolarPeso() {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese el valor en dólares
        System.out.println("Ingrese el valor en dólares:");
        double dolares = scanner.nextDouble();
        // Calcular el valor en pesos utilizando el tipo de cambio y mostrar el resultado
        double pesos = dolares * 58.50; // Se asume un tipo de cambio de 1 dólar = 58.50 pesos (solo como ejemplo)
        System.out.println("El valor en pesos es: " + pesos);
    }

    // Método para calcular el valor de venta de un producto
    public void valorDeUnProducto() {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese el valor de compra del producto
        System.out.println("Ingrese el valor de compra del producto:");
        double valorCompra = scanner.nextDouble();
        // Calcular el valor de venta aplicando un margen de ganancia del 50% y mostrar el resultado
        double valorVenta = valorCompra * 1.5; // Se asume un margen de ganancia del 50% (solo como ejemplo)
        System.out.println("El valor de venta del producto es: " + valorVenta);
    }

    // Método para calcular el voltaje (V) dados la corriente (I) y la resistencia (R)
    public void formulaDelVoltaje() {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese la corriente en amperios (I) y la resistencia en ohmios (R)
        System.out.println("Ingrese la corriente en amperios (I):");
        double corriente = scanner.nextDouble();
        System.out.println("Ingrese la resistencia en ohmios (R):");
        double resistencia = scanner.nextDouble();
        // Calcular el voltaje (V) utilizando la ley de Ohm y mostrar el resultado
        double voltaje = corriente * resistencia;
        System.out.println("El voltaje es: " + voltaje + " voltios");
    }

    // Método para calcular la velocidad (v) dados la distancia (d) y el tiempo (t)
    public void formulaDeVelocidad() {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese la distancia en metros (d) y el tiempo en segundos (t)
        System.out.println("Ingrese la distancia en metros (d):");
        double distancia = scanner.nextDouble();
        System.out.println("Ingrese el tiempo en segundos (t):");
        double tiempo = scanner.nextDouble();
        // Calcular la velocidad (v) dividiendo la distancia por el tiempo y mostrar el resultado
        double velocidad = distancia / tiempo;
        System.out.println("La velocidad es: " + velocidad + " m/s");
    }
}
