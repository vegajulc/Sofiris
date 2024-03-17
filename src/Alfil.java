public class Alfil extends Fichas {
    public Alfil (String nombre,String color,String posicionF, String posicionC, int filaLogica, int columnaLogica ) {
        super(nombre, color, posicionF,posicionC,filaLogica,columnaLogica);
    }
    public boolean moverAlfil(){
        return recorrerFilaColumna("Diagonal",f0,c0,fF,cF,esBlanca,esContraria);
    }
}
