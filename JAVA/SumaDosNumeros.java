import java.util.Scanner;
public class SumaDosNumeros{

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);
        // Crear un objeto de la clase SumaDosNumeros para realizar operaciones matemáticas
        SumaDosNumeros calculadora = new SumaDosNumeros();
        
        // Declaración de variable para almacenar la opción del usuario
        int opcion;
        
        // Iniciar un bucle do-while para mostrar el menú hasta que el usuario elija salir (opción 0)
        do {
            // Mostrar el menú en la consola
            System.out.println("Menú:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            // Leer la opción ingresada por el usuario
            opcion = scanner.nextInt();
            
            // Evaluar la opción ingresada por el usuario y realizar la operación correspondiente
            switch (opcion) {
                case 1:
                    calculadora.suma(); // Llamar al método suma() de la clase SumaDosNumeros
                    break;
                case 2:
                    calculadora.resta(); // Llamar al método resta() de la clase SumaDosNumeros
                    break;
                case 3:
                    calculadora.multiplicacion(); // Llamar al método multiplicacion() de la clase SumaDosNumeros
                    break;
                case 4:
                    calculadora.division(); // Llamar al método division() de la clase SumaDosNumeros
                    break;
                case 0:
                    System.out.println("Saliendo del programa..."); // Mensaje de salida del programa
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo."); // Mensaje de opción inválida
                    break;
            }
        } while (opcion != 0); // Continuar el bucle hasta que el usuario elija salir
        
        // Cerrar el objeto Scanner para liberar los recursos
        scanner.close();
    }    

    public int suma() {
        //Definimos dos variables para almacenar los números que deseamos 
        int numero1=5; //Primer número
        int numero2=7; //Segundo número
    
        //calcular operación de los dos números
        int resultado=numero1+numero2;
        //mostramos la operación
        System.out.println("La resta de los números es: " + resultado);
        return resultado;
    }

    public int resta() {
        //Definimos dos variables para almacenar los números que deseamos 
        int numero1=5; //Primer número
        int numero2=7; //Segundo número

        //calcular operación de los dos números
        int resultado=numero1+numero2;
        //mostramos la operación
        System.out.println("La resta de los números es: " + resultado);
        return resultado;
    }

    public int multiplicacion() {
        //Definimos dos variables para almacenar los números que deseamos 
        int numero1=5; //Primer número
        int numero2=7; //Segundo número
    
        //calcular operación de los dos números
        int resultado=numero1*numero2;
        //mostramos la operación
        System.out.println("La multiplicación de los números es: " + resultado);
        return resultado;
    }

    public int division() {
        //Definimos dos variables para almacenar los números que deseamos 
        int numero1=5; //Primer número
        int numero2=7; //Segundo número
    
        //calcular operación de los dos números
        int resultado=numero1/numero2;
        //mostramos la operación
        System.out.println("La resta de los números es: " + resultado);
        return resultado;
    }
}