import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

public class Sprite extends ObjecteGrafic implements Movible{
    protected Image imatge;
    protected int amplada, altura;
    protected int velocitatX, velocitatY;

    public Sprite(int x, int y, int amplada, int altura, String rutaImatge) {
        super(x, y, null);
        try {
            imatge = ImageIO.read(new File(rutaImatge));
        } catch (Exception e) {
            System.out.println("Error llegint la imatge " + rutaImatge);
            imatge = null;
        }
        this.amplada = amplada;
        this.altura = altura;
    }

    public void pinta(Graphics g) {
        g.drawImage(imatge, x, y, null);
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