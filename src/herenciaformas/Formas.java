public class Formas {
    private String color;

    public Formas(String color) {
        this.color = color;
    }

    public void establecerColor(String color) {
        this.color = color;
    }

    public String obtenerColor() {
        return color;
    }

    public void dibujar() {
        System.out.println("Dibujando una forma genérica");
    }

    public void calcularArea() {
        System.out.println("Calculando área de una forma genérica");
    }
}