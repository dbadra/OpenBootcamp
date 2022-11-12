import java.util.Objects;
import java.util.Scanner;

public class Calculo {
    public Calculo() {
    }

    public static void main(String[] args) {
        System.out.println("Introduce el tipo de producto / alimento-otro");
        Scanner scannerProducto = new Scanner(System.in);
        String producto = scannerProducto.nextLine();
        System.out.println("Introduce el Precio del Producto");
        Scanner scanner = new Scanner(System.in);
        float precioSinIva = scanner.nextFloat();
        float iva;
        if (Objects.equals(producto, "alimento")) {
            iva = 10.5F;
        } else {
            iva = 21.5F;
        }

        System.out.println("El iva aplicado es :" + iva);
        System.out.println("seleccione una tecla para continuar");
        Scanner continua = new Scanner(System.in);
        String letra = continua.next();
        float precioFinal = calcularIva(precioSinIva, iva);
        System.out.println("el Precio sin Iva " + precioSinIva);
        System.out.println("Precio final :" + precioFinal);
        System.out.println(letra);

    }

    private static float calcularIva(float precioSinIva, float iva) {
        iva /= 100.0F;
        return precioSinIva + precioSinIva * iva;
    }
}
