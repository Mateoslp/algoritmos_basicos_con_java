import java.util.Scanner; //importar la clase scanner del paquete java.util

public class CalculadoraEdad{ //definir la clase de la calculadora y publica
    //definimos el método principal donde se iniciará a ejecutar el código de nuestra clase.
    public static void main(String[] args) {
        //Creamos el objeto llamado scanner (instanciamos la clase) para leer las entradas del usuario.
        Scanner scanner= new Scanner(System.in);

        //Mostrar mensaje pidiendo al usuario que ingrese el año de nacimiento
        System.out.println("Ingresa tu año de nacimiento");
        int anoNacimiento = scanner.nextInt();  //Utilizamos el método nextInt del objeto scanner para leer el año de nacimientO

    
        System.out.println("Ingresa el año actual ");
        int anoActual= scanner.nextInt();  //Utilizamos el método nextInt del objeto scanner para leer el año actual

        int Edad= anoActual - anoNacimiento; //Hacemos la operación aritmetica

        System.out.println("Tu edad es: " + Edad + " Años"); //Imprimimos resultados

        scanner.close();
    }
}  