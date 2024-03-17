import javax.swing.*;
import java.awt.*;

public class Tabla extends javax.swing.JFrame {
    private javax.swing.JPanel jPanel1;
    Graphics g; int xy;
    public Tabla(String titulo) {
        initComponents();
    }
    public Tabla() {
        setPreferredSize(new Dimension(800, 600));
    }


    private void initComponents() {

 //       this.setTitle(titulo);
   //     this.setContentPane(new Tabla());
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setBounds(0, 0, 512, 512);
        jPanel1 = new JPanel();
        setContentPane(jPanel1);
        jPanel1.setBounds(0, 0, 512, 512);
        jPanel1.setBackground(new java.awt.Color(190, 190, 190));
        jPanel1.setLayout(null);
        //jPanel1.setBackground(Color.lightGray);
        jPanel1.getGraphics();
        jPanel1.getWidth();
//        paint(jPanel1.getGraphics());
    }
    @Override
    public void paint (Graphics g)
    {
        super.paint(g);
        Toolkit t = Toolkit.getDefaultToolkit ();
        Image imagen = t.getImage ("/tableroajedrez1.jpeg");
        g.drawImage (imagen, 0, 0, this);
    }
    //private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {
       // Dibujar t = new Dibujar(g, xy);
    //}





}