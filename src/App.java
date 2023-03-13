import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App extends JPanel {
    private static final long serialVersionUID = 1L;

    private ObjecteGrafic[] objectes = new ObjecteGrafic[] {
            new Cercle(50, 50, 30, Color.RED),
            new Triangle(150, 50, 50, 50, Color.GREEN),
            new Ellipse(250, 50, 30, 50, Color.BLUE),
            new Sprite(50, 100, 50, 50,"joel.jpg")
    };


    public App() {
        setPreferredSize(new Dimension(400, 200));
        ((Movible)objectes[0]).setVelocitat(3, 0);
        ((Movible)objectes[1]).setVelocitat(3, 0);
        ((Movible)objectes[2]).setVelocitat(3, 0);
        ((Movible)objectes[3]).setVelocitat(3, 0);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (ObjecteGrafic objecte : objectes) {
            objecte.pinta(g);
        }
    }

    public void anima() {
        while (true) {
            for (ObjecteGrafic objecte : objectes) {
                if (objecte instanceof Movible) {
                    ((Movible)objecte).mou();
                }
            }
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame finestra = new JFrame("Marione");
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App panell = new App();
        finestra.setContentPane(panell);
        finestra.pack();
        finestra.setVisible(true);
        Thread animacio = new Thread() {
            public void run() {
                panell.anima();
            }
        };
        animacio.start();
    }
}