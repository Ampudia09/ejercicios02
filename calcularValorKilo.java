import java.util.Scanner;
public class calcularValorKilo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var gramos100 = 5.95;
        var kilo = gramos100*10;
        System.out.println("esto es lo que cuesta realmente un kilo" + " " + kilo);
        System.out.print("Ingrese la cantidad de kilos a la cual se le calculara el valor total: ");
        int kilos = scanner.nextInt();
        double valor = kilos*kilo;
        System.out.println("El valor total es: " + valor + "$");
        scanner.close();


    }

    
}