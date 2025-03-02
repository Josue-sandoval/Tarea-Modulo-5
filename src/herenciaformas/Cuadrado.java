public class Cuadrado extends Formas {
    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }

    @Override
    public void calcularArea() {
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }
}
