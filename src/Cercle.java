import java.awt.*;

public class Cercle extends ObjecteGrafic implements Movible{
    protected int radi;
    protected int velocitatX, velocitatY;

    public Cercle(int x, int y, int radi, Color color) {
        super(x, y, color);
        this.radi = radi;
    }

    public void pinta(Graphics g) {
        g.setColor(color);
        g.drawOval(x - radi, y - radi, radi * 2, radi * 2);
    }

    @Override
    public void mou() {
        x += velocitatX;
        y += velocitatY;
    }

    @Override
    public void setVelocitat(int x, int y) {
        velocitatX = x;
        velocitatY = y;
    }
}
