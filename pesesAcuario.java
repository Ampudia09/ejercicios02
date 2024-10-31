import java.util.Scanner;

public class pesesAcuario {
    public static void main(String[] args) {
        int rojos = 284;
        int azules = 163;
        int pecesTotal = rojos + azules;
        System.out.println("el total de peces son " + pecesTotal);

        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la cantidad de peces rojos que desee:");
        var pecesR = scanner.nextInt();
        System.out.print("ingrese la cantidad de peces azules que desee:");
        var pecesA = scanner.nextInt();
        var pecesitos = pecesA + pecesR;

        System.out.println("el total de peces sumados en el acuario es de: " + pecesitos);
        scanner.close();



    }
}
