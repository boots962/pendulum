import javax.swing.JFrame;

import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

public class Window extends Canvas {
    private static String title = "Pendulum";
    public static JFrame frame = new JFrame(title);
    public static int width = 1280, height = 720;
    private static double i = 0, j = 0, k = 0;
    public static void main(String [] args){
        Window w = new Window();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(3);
        frame.add(w);
        frame.setVisible(true);
        w.create();
    }

    public void create(){
        boolean running = true;
        while(running){
            render();
        }
    }   

    public void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs==null){
            this.createBufferStrategy(3);
            return;

        }
        Graphics2D g = (Graphics2D)bs.getDrawGraphics();
        double b = Vector2D.y(i, 200);
        double a = Vector2D.x(i, 200);
        double deltab = Vector2D.y(j, 50);
        double deltaa = Vector2D.x(j, 50);
        double delta2b = Vector2D.y(k, 100);
        double delta2a = Vector2D.x(k, 100);
        int b1 = (int) b;
        int a1 = (int) a;
        int deltab1 = (int) deltab;
        int deltaa1 = (int) deltaa;
        int deltab12 = (int) delta2b;
        int deltaa12 = (int) delta2a;
        g.clearRect(0, 0, getWidth(), getHeight());
        g.drawLine(640, 360, 640+a1, b1+360);
        g.drawLine((640+a1), (b1+360), (640+a1)+deltaa1, (b1+360) + deltab1);
        g.drawLine((640+a1)+deltaa1, (b1+360) + deltab1, (640+a1)+deltaa1+deltaa12, (b1+360) + deltab1+deltab12);

        g.drawString("Rad long arm: "+Vector2D.theta1, 0, 100);
        g.drawString("Magnitude: "+Vector2D.magnitude(i, 200), 0, 120);
        g.drawString("Proj: "+(Vector2D.magnitude(i, 200)*Math.cos(Vector2D.theta1)), 0, 140);
        i+=0.0025;
        j+=0.0125;
        k+=0.00625;
        g.dispose();
        bs.show();
    }
}