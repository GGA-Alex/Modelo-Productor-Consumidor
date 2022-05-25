
public class Auto {
    private String marca;
    private String color;

    public Auto(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", color=" + color + '}';
    }
}
