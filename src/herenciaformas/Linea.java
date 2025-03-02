public class Linea extends Formas {
    private double longitud;

    public Linea(String color, double longitud) {
        super(color);
        this.longitud = longitud;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una línea");
    }

    @Override
    public void calcularArea() {
        System.out.println("Una línea no tiene área");
    }
}
