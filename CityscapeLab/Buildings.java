import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JComponent;
import java.awt.Rectangle;
public class Buildings extends JComponent
{
        public class Building
        {
            private int xcord;
            private int ycord;
            private int wcord;
            private int hcord;
            public Building (int x, int y, int w, int h)
            {
                xcord = x;
                ycord = y;
                wcord = w;
                hcord = h;
            }
            public void paintComponent(Graphics2D g2)
            {
                Rectangle building = new Rectangle(xcord,ycord,wcord,hcord);
                Rectangle window = new Rectangle(xcord + 10,ycord + 10,50,50);
                Rectangle window1 = new Rectangle(xcord + 90,ycord + 10,50,50);
                Rectangle window2 = new Rectangle(xcord + 10,ycord + 70,50,50);
                Rectangle window3 = new Rectangle(xcord + 90,ycord + 70,50,50);
                Rectangle window4 = new Rectangle(xcord + 10,ycord + 130,50,50);
                Rectangle window5 = new Rectangle(xcord + 90,ycord + 130,50,50);
                Rectangle sky = new Rectangle(0,0,800,800);
                g2.setColor(Color.BLUE);
                g2.draw(sky);
                g2.fill(sky);
                g2.setColor(Color.BLACK);
                g2.draw(building);
                g2.fill(building);
                g2.setColor(Color.WHITE);
                g2.draw(window);
                g2.draw(window1);
                g2.draw(window2);
                g2.draw(window3);
                g2.draw(window4);
                g2.draw(window5);
                g2.fill(window);
                g2.fill(window1);
                g2.fill(window2);
                g2.fill(window3);
                g2.fill(window4);
                g2.fill(window5);
            }
        }
}
