public class nuevoPc {
    public static void main(String[] args) {
        System.out.println("quiero comprarme una nueva pc :)");
        System.out.println("pedro me la vende en 660$ y me da el 10% de descuento");
        System.out.println("calculemos en cuanto me sale");
        var pcDescuento = 660 * 0.1;
        var pc = 660-pcDescuento;
        System.out.println("me sale la pc en " + pc + "$");

    }
}
