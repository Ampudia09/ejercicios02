import java.util.Scanner;

public class areaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();

        
        System.out.print("Ingrese el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();

        
        double area = longitud * ancho;

        
        double perimetro = 2 * (longitud + ancho);

        
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        
        scanner.close();
    }
}
