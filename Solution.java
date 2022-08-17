import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Solution extends JFrame{ // inheritance
  public Solution(){ //constructor
    setTitle("Shapes");
    setBounds(50, 50, 500, 500);
    setVisible(true);    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  
  @Override
  public void paint(Graphics g){ // method
    Graphics2D g2d = (Graphics2D) g;
    System.out.println("Enter the shape u want to draw: \n 1. Circle \n 2. Rectangle \n 3. Triangle \n");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    if(input == 1){
      System.out.println("Circle selected \n");
      System.out.println("Enter the Diameter of the Circle\n");
      int x;
      x = sc.nextInt();
      if (x < 50) x *= 10;
      g.drawOval(100, 100, x, x);
    }else if(input == 2){
      System.out.println("Rectangle Selected \n");
      int length, height;
      System.out.println("Enter the Length of the Rectangle:\n");
      length = sc.nextInt();
      System.out.println("Enter the Height of the Rectangle:\n");
      height = sc.nextInt();
      if(height < 50 & length < 50){
        length *= 10;
        height *= 10;
      }
      g.drawRect(100, 100, length, height);
    }else if(input == 3){
      System.out.println("Triangle Selected: \n ");
      int base, sidea, sideb, apexY, apexZ;
      System.out.println("Enter the base of the Triangle:\n");
      base = sc.nextInt();
      System.out.println("Enter the meeting point Y of he triangle (apexY):\n");
      apexY = sc.nextInt();
      System.out.println("Enter apex Z of the triangle (apexZ):\n");
      apexZ = sc.nextInt();
      System.out.println("Enter the Length of side A: \n");
      sidea = sc.nextInt();
      System.out.println("Enter the Length of side B: \n");
      sideb = sc.nextInt();
      if (base < 30){
        base *= 10;
      }
      if (sidea < 20 || sideb < 20){
        sidea *= 2;
        sideb *= 2;
      }
      int [] xPoints = {apexZ, sidea, sideb};
      int [] yPoints = {apexY, base, base};
      int nPoints = 3;
      g.drawPolygon(xPoints,yPoints,nPoints);
    }else{
      System.out.println("Please Enter the correct input and restart the program");
    }
  }
  public static void main(String[] args) {
    new Solution(); //object
  }
}
