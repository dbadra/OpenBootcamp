public class Main {
    public static void main(String[] args) {

        int numero1 = -3;


        if (numero1 > 0) {

            System.out.println("El numero " + numero1 + " es positivo");


        } else {

            if (numero1 < 0) {

                System.out.println("El numero " + numero1 + " es negativo");

            } else {

                System.out.println("El numero es " + numero1);

            }

        }

        int numero2 = 0;

        while(numero2 < 3){

            System.out.println("listado" + numero2);
            numero2++;


        }

        int numero3 = 0;
        do {
            System.out.println("el numero 3 es: " + numero3);
            numero3 = numero3 + 1 ;
        }
            while (numero3 <1);

        for(int i=0;i<3;i++){

            System.out.println(i);
        }

        var Variable = "Primavera";

        switch (Variable){

            case "Verano":
                System.out.println("Verano");
                break;

            case "Invierno":
                System.out.println("Inverno");
                break;
            case "Otoño":
                System.out.println("Otoño");
                break;
            case "Primavera":
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Verificar la variable ingresada");





        }


    }
}