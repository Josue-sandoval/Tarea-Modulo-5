import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos para el círculo
        System.out.print("Ingrese el color del círculo: ");
        String colorCirculo = scanner.nextLine();
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        Circulo circulo = new Circulo(colorCirculo, radio);

        // Pedir datos para el cuadrado
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el color del cuadrado: ");
        String colorCuadrado = scanner.nextLine();
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        Cuadrado cuadrado = new Cuadrado(colorCuadrado, lado);

        // Pedir datos para el triángulo
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el color del triángulo: ");
        String colorTriangulo = scanner.nextLine();
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();
        Triangulo triangulo = new Triangulo(colorTriangulo, base, altura);

        // Pedir datos para la línea
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el color de la línea: ");
        String colorLinea = scanner.nextLine();
        System.out.print("Ingrese la longitud de la línea: ");
        double longitud = scanner.nextDouble();
        Linea linea = new Linea(colorLinea, longitud);

        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        circulo.dibujar();
        circulo.calcularArea();

        cuadrado.dibujar();
        cuadrado.calcularArea();

        triangulo.dibujar();
        triangulo.calcularArea();

        linea.dibujar();
        linea.calcularArea();

        scanner.close();
    }
}