import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la temperatura en grados Celsius al usuario
        System.out.print("Introduce la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Realizar las conversiones
        double fahrenheit = convertirAFahrenheit(celsius);
        double kelvin = convertirAKelvin(celsius);

        // Mostrar los resultados
        System.out.printf("%.2f° Celsius es igual a %.2f° Fahrenheit y %.2f Kelvin.%n", celsius, fahrenheit, kelvin);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para convertir Celsius a Fahrenheit
    public static double convertirAFahrenheit(double celsius) {
        return celsius * 9/5 + 32;
    }

    // Método para convertir Celsius a Kelvin
    public static double convertirAKelvin(double celsius) {
        return celsius + 273.15;
    }
}