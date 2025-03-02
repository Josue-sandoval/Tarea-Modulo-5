public class Circulo extends Formas {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo");
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
}