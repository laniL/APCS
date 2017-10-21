package methods;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString( "BIG HOUSE ", 50, 50 );

      window.fillRect( 200, 300, 400, 300 );
      
      window.setColor(Color.YELLOW);
      window.fillRect(160, 260, 480, 40);
      window.fillRect(200, 220, 400, 40);
      window.fillRect(240, 180, 320, 40);
      window.fillRect(280, 140, 240, 40);
      window.fillRect(320, 100, 160, 40);
      window.fillRect(360, 60, 80, 40);
      window.fillRect(300, 450, 100, 150);
      
      window.setColor(Color.WHITE);
      window.fillRect(450, 460, 100, 100);
      
      window.setColor(Color.BLACK);
      window.fillRect(499, 460, 2, 100);
      window.fillRect(450, 509, 100, 2);

   }
}