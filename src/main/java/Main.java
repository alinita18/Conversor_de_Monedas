import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        String moneda1 = "";
        String moneda2 = "";
        double monto = 0;
        ConsultExchange consultExchange = new ConsultExchange();
        System.out.println("""
                    ************************************************************
                    Sea bienvenido/a al Conversor de Monedas de Alura
                    Elija una opción válida:
                    1) Dolar =>> Peso argentino
                    2) Peso argentino =>> Dolar
                    3) Dolar =>> Real brasileño
                    4) Real brasileño =>> Dolar
                    5) Dolar =>> Peso colombiano
                    6) Peso colombiano =>>Dolar
                    7) Salir                
                    ************************************************************
                    """);
        opcion = scanner.nextInt();
        while (opcion != 7) {
            System.out.println("Ingrese el monto que desea convertir");
            monto = scanner.nextDouble();
            switch(opcion) {
                case 1:
                    moneda1 = "USD";
                    moneda2 = "ARG";
                    Conversion conversion = consultExchange.convertir("USD", "ARS",monto);
                    conversion.setMonto(monto);
                    System.out.println(conversion);
                    break;
                case 2:
                    conversion = consultExchange.convertir("ARS", "USD",monto);
                    conversion.setMonto(monto);
                    System.out.println(conversion);
                    break;
                case 3:
                    conversion = consultExchange.convertir("USD", "BRL",monto);
                    conversion.setMonto(monto);
                    System.out.println(conversion);
                    break;
                case 4:
                    conversion = consultExchange.convertir("BRL", "USD",monto);
                    conversion.setMonto(monto);
                    System.out.println(conversion);
                    break;
                case 5:
                    conversion = consultExchange.convertir("USD", "COP",monto);
                    conversion.setMonto(monto);
                    System.out.println(conversion);
                    break;
                case 6:
                    conversion = consultExchange.convertir("COP", "USD",monto);
                    conversion.setMonto(monto);
                    System.out.println(conversion);
                    break;
                default:
                    System.out.println("Escoja una opción válida");

            }
            System.out.println("""
                    ************************************************************
                    Sea bienvenido/a al Conversor de Monedas de Alura
                    Elija una opción válida:
                    1) Dolar =>> Peso argentino
                    2) Peso argentino =>> Dolar
                    3) Dolar =>> Real brasileño
                    4) Real brasileño =>> Dolar
                    5) Dolar =>> Peso colombiano
                    6) Peso colombiano =>>Dolar
                    7) Salir                
                    ************************************************************
                    """);
            opcion = scanner.nextInt();

        }

    }
}