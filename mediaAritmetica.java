import java.util.Scanner;

public class mediaAritmetica {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los tres números
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double num3 = scanner.nextDouble();

        // Calcular la media aritmética
        double media = calcularMedia(num1, num2, num3);

        // Mostrar el resultado
        System.out.printf("La media aritmética de %.2f, %.2f y %.2f es %.2f.%n", num1, num2, num3, media);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para calcular la media aritmética de tres números
    public static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}

