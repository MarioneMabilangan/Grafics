import java.awt.*;

public abstract class ObjecteGrafic {
    protected int x, y;
    protected Color color;

    public ObjecteGrafic(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void pinta(Graphics g);
}
