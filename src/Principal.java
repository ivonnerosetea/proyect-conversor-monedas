import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\u001B[33m\u001B[1m\u001B[4m\u001B[3m\u001B[36m¡Bienvenido/a al conversor de monedas!\u001B[0m\n");

        Scanner entrada = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion = 0;
        double monto = 0;
        String origen = "";
        String destino = "";

        try {
            while (opcion != 7) {
                String menu = """
                1) Dólar ==> Peso argentino
                2) Peso argentino ==> Dólar
                3) Dólar ==> Real brasileño
                4) Real brasileño ==> Dólar
                5) Dólar ==> Peso colombiano
                6) Peso colombiano ==> Dólar
                7) Salir

                Elija una opción válida:
                """;

                System.out.println(menu);

                opcion = Integer.parseInt(entrada.nextLine());
                if (opcion == 7) {
                    System.out.println("Saliendo del programa...");
                    break;
                }

                System.out.print("Ingrese el monto a convertir: ");
                monto = Double.parseDouble(entrada.nextLine());

                switch (opcion) {
                    case 1 -> { origen = "USD"; destino = "ARS"; }
                    case 2 -> { origen = "ARS"; destino = "USD"; }
                    case 3 -> { origen = "USD"; destino = "BRL"; }
                    case 4 -> { origen = "BRL"; destino = "USD"; }
                    case 5 -> { origen = "USD"; destino = "COP"; }
                    case 6 -> { origen = "COP"; destino = "USD"; }
                    default -> {
                        System.out.println("Opción no válida");
                        continue;
                    }
                }

                double resultado = consulta.consultaDeMoneda(origen, destino, monto);
                System.out.printf("\n%.2f %s equivalen a %.2f %s\n", monto, origen, resultado, destino);
                System.out.println("\n\u001B[32m\u001B[1m\u001B[4m\u001B[3m\u001B[36m\t\t\t\t\t\t\t\t\t\t\u001B[0m\n");

            }

        } catch (IOException | InterruptedException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Debe ingresar números válidos.");
        }
    }
}


