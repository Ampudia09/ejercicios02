import java.util.Scanner;

public class calculadoraBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el primer numero: ");
        var num1 = scanner.nextInt();
        System.out.print("Digite el segundo numero: ");
        var num2 = scanner.nextInt();
        System.out.print("si sumamos los dos numeros da: ");
        int suma = num1 + num2;
        System.out.println(suma);
        System.out.print("si restamos los dos numeros da: ");
        double resta = num1 - num2;
        System.out.println(resta);
        System.out.print("si multiplicamos los dos numeros da: ");
        double multiplicacion = num1 * num2;
        System.out.println(multiplicacion);
        System.out.print("si dividimos los dos numeros da: ");
        double division = num1 / num2;
        System.out.println(division);





    }
}
