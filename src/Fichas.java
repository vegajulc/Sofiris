public class Fichas {
    //Atributos
    String color;
    String nombre;
    String posicionF;
    String posicionC;
    int filaLogica;
    int columnaLogica;

    public Fichas(String nombre, String color, String posicionF, String posicionC, int filaLogica, int columnaLogica) {
        this.nombre = nombre;
        this.color = color;
        this.posicionF= posicionF;
        this.posicionC= posicionC;
        this.filaLogica = filaLogica;
        this.columnaLogica = columnaLogica;
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
    int getFilaLogica() { return filaLogica; }
    int getColumnaLogica() { return filaLogica; }
    /*public  boolean recorrerFilaColumna(String fila, Fichas ficha1, Movimiento movimiento1 ) {
        boolean esValido = false;
        if (fila.equals("Fila")) {
            // Movimiento en fila
            if (ficha1.getFilaLogica() == movimiento1.getFilaLogica()) {
                int paso = (cF > c0) ? 1 : -1;
                for (int c = c0 + paso; c != cF; c += paso) {
                    // Verificar si la casilla intermedia contiene una ficha
                    if (!matrizTablero[filaLogica][columnaLogica].equals("  ")) {
                        // Si la casilla contiene una ficha del jugador contrario, el movimiento es válido
                        if ((esContraria && matrizTablero[f0][c].substring(1, 2).equals("B"))
                                || (!esContraria && matrizTablero[f0][c].substring(1, 2).equals("N"))) {
                            esValido = true;
                        } else {
                            // Si la casilla contiene una ficha del mismo jugador, el movimiento es inválido
                            esValido = false;
                            break;
                        }
                    }
                }
                // Si no se encontraron fichas en las casillas intermedias, el movimiento es válido
                if (!esValido) {
                    esValido = true;
                }
            }
        } else if (fila.equals("Columna")) {
            // Movimiento en columna
            if (c0 == cF) {
                int paso = (fF > f0) ? 1 : -1;
                for (int f = f0 + paso; f != fF; f += paso) {
                    // Verificar si la casilla intermedia contiene una ficha
                    if (!matrizTablero[f][c0].equals("  ")) {
                        // Si la casilla contiene una ficha del jugador contrario, el movimiento es válido
                        if ((esContraria && matrizTablero[f][c0].substring(1, 2).equals("B")) || (!esContraria && matrizTablero[f][c0].substring(1, 2).equals("N"))) {
                            esValido = true;
                        } else {
                            // Si la casilla contiene una ficha del mismo jugador, el movimiento es inválido
                            esValido = false;
                            break;
                        }
                    }
                }
                // Si no se encontraron fichas en las casillas intermedias, el movimiento es válido
                if (!esValido) {
                    esValido = true;
                }
            }
        } else if (fila.equals("Diagonal")) {
            if (Math.abs(c0 - cF) == Math.abs(f0 - fF)) {
                int pasoFila = (fF > f0) ? 1 : -1;
                int pasoColumna = (cF > c0) ? 1 : -1;
                int filaInicial = f0 + pasoFila;
                int columnaInicial = c0 + pasoColumna;

                while (filaInicial != fF && columnaInicial != cF) {
                    if (!matrizTablero[filaInicial][columnaInicial].equals("  ")) {
                        // Si la casilla intermedia no está vacía, se debe romper el bucle
                        break;
                    }
                    filaInicial += pasoFila;
                    columnaInicial += pasoColumna;
                }

                if (matrizTablero[fF][cF].isBlank() || matrizTablero[fF][cF].isEmpty()) {
                    esValido = true;
                } else {
                    // Verifica si la casilla de destino contiene una ficha del jugador contrario
                    if ((esContraria && !matrizTablero[fF][cF].substring(1, 2).equals("B")) ||
                            (esContraria && matrizTablero[fF][cF].substring(1, 2).equals("B"))) {
                        esValido = true;
                    }


                }
            }
        }
        return esValido;
    }*/

}
