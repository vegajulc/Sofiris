public class TableroAjedrez {
    Peon fP1,fP2,fP3,fP4,fP5,fP6,fP7,fP8;
    Caballo fC1,fC2;
    Alfil fA1,fA2;
    Torre fT1,fT2;
    Rey fR1; Dama fD1;

    public  TableroAjedrez(){
        crearMatrizTablero();
        dibujarTablero();
        crearFichasBlancas();
        dibujasFichasBlancas();


    }

    private void dibujasFichasBlancas() {
    }

    private void dibujarTablero() {
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tabla("Ajedrez").setVisible(true);
            }
        });*/

    }

    private void crearFichasBlancas() {
        fP1 = new Peon("P1","Blanca","a", "2",6,0);
        fP2 = new Peon("P2","Blanca","b", "2",6,1);
        fP3 = new Peon("P3","Blanca","c", "2");
        fP4 = new Peon("P4","Blanca","d", "2");
        fP5 = new Peon("P5","Blanca","e", "2");
        fP6 = new Peon("P6","Blanca","f", "2");
        fP7 = new Peon("P7","Blanca","g", "2");
        fP8 = new Peon("P8","Blanca","h", "2");
        fC1 = new Caballo("C1","Blanca","b", "1");
        fC2 = new Caballo("C2", "Blanca", "g", "1");
        fA1 = new Alfil("A1","Blanca","c", "1",7,2);
        fA2 = new Alfil("A2","Blanca","f", "1",7,5);
        fT1 = new Torre("T1","Blanca","a", "1");
        fT2 = new Torre("T2","Blanca","h", "1");
        fR1 = new Rey("R1", "Blanca", "a", "1");
        fD1 = new Dama("D1","Blanca","h", "1");
    }

    public void crearMatrizTablero (){
        Fichas[][] tableroAjedrez = new Fichas[8][8];
        tableroAjedrez[6][0] = fP1;
        tableroAjedrez[6][1] = fP2;
        tableroAjedrez[6][2] = fP3;
        tableroAjedrez[6][3] = fP4;
        tableroAjedrez[6][4] = fP5;
        tableroAjedrez[6][5] = fP6;
        tableroAjedrez[6][6] = fP7;
        tableroAjedrez[6][7] = fP8;
        tableroAjedrez[7][0] = fT1;
        tableroAjedrez[7][7] = fT2;
        tableroAjedrez[7][2] = fA1;
        tableroAjedrez[7][5] = fA2;
        tableroAjedrez[7][1] = fC1;
        tableroAjedrez[7][6] = fC2;
        tableroAjedrez[7][4] = fR1;
        tableroAjedrez[7][3] = fD1;

    }
}
