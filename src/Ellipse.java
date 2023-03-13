import java.awt.*;

public class Ellipse extends ObjecteGrafic implements Movible{
    protected int radiX, radiY;
    protected int velocitatX, velocitatY;

    public Ellipse(int x, int y, int radiX, int radiY, Color color) {
        super(x, y, color);
        this.radiX = radiX;
        this.radiY = radiY;
    }

    public void pinta(Graphics g) {
        g.setColor(color);
        g.drawOval(x - radiX, y - radiY, radiX * 2, radiY * 2);
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