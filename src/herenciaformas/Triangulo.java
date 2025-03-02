public class Triangulo extends Formas {
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo");
    }

    @Override
    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }
}
