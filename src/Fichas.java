public class Fichas {
    //Atributos
    private String color;
    private String nombre;
    private String posicionF;
    private String posicionC;

    public Fichas(String nombre, String color, String posicionF, String posicionC) {
        this.nombre = nombre;
        this.color = color;
        this.posicionF= posicionF;
        this.posicionC= posicionC;
    }

    String getNombre(){
        return nombre;
    }
    String getColor(){
        return color;
    }
    String getPosicionF(){
        return posicionF;
    }
    String getPosicionC(){
        return posicionC;
    }
}
