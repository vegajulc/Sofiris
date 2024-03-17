public class Torre extends Fichas {
    private final String nombre;
    private final String color;
    private final String posicionF;
    private final String posicionC;

    public Torre (String nombre,String color,String posicionF, String posicionC, int filaLogica, int columnaLogica ) {
        super(nombre, color, posicionF,posicionC,filaLogica,columnaLogica);
        this.nombre = nombre;
        this.color = color;
        this.posicionF = posicionF;
        this.posicionC = posicionC;
    }
}