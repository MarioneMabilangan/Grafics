import java.awt.*;

public class Triangle extends ObjecteGrafic implements Movible{
    protected int base, altura;
    protected int velocitatX, velocitatY;

    public Triangle(int x, int y, int base, int altura, Color color) {
        super(x, y, color);
        this.base = base;
        this.altura = altura;
    }

    public void pinta(Graphics g) {
        g.setColor(color);
        g.drawLine(x - base / 2, y + altura / 2, x + base / 2, y + altura / 2);
        g.drawLine(x - base / 2, y + altura / 2, x, y - altura / 2);
        g.drawLine(x + base / 2, y + altura / 2, x, y - altura / 2);
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
