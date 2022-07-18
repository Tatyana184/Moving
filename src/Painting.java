import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class Painting extends JFrame {
    static BufferedImage image;
    int x = 20;
    int y = 20;

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,600,600);
        g.drawImage(image, x, y, null);

       if (x < 100 && y == 20) {
        x += 10;
       }
       if(x == 100 && y < 100) {
         y += 10;
        }
        if(y == 100 && x > 20){
          x -= 10;
       }
        if(x == 20 && y > 20){
            y -= 10;
        }
    }
    Painting(){
        try {
        image = ImageIO.read(new File("C:\\Users\\tatia\\Desktop\\3.jpg"));
    } catch(Exception e){

    }
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    });
    timer.start();
    }
}
