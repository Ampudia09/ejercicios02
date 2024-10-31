public class nuevosPants {
    public static void main(String[] args) {
        System.out.println("sali a comprarme unos pantalones, me costaron 34 $ y tenian 15% de descuento, cuanto me costarian sin descuento");
        double precioConDescuento = 34.0;
        double descuento = 15.0;
        double precioOriginal = precioConDescuento / (1 - (descuento / 100));
        System.out.println("el precio original de los pantalones es de " + precioOriginal + "$");
    }
}
