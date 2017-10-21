package methods;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

      window.setColor(Color.GREEN);
      window.fillArc(280, 200, 100, 70, 0, 180);
      window.fillArc(420, 200, 100, 70, 0, 180);
      
      window.setColor(Color.WHITE);
      window.fillArc(300, 240, 200, 160, 180, 180);
      
      window.setColor(Color.BLACK);
      window.fillRect(311, 355, 179, 2);
      window.fillRect(340, 320, 2, 65);
      window.fillRect(380, 320, 2, 78);
      window.fillRect(420, 320, 2, 78);
      window.fillRect(460, 320, 2, 64);
      window.fillOval(312, 200, 35, 35);
      window.fillOval(450, 200, 35, 35);

   }
}