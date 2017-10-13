import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Practice: Coding  Exercise #1 */
public class Level0PracticeExam {

    public static void main(String[] args) {
	 // 1. Create a random number from 0 to 4 and store it in a ‘bases’ variable 
    	Random bases=new Random();
    	Robot robo= new Robot("batman");
	 // 2. If the number is zero  display a window that says “the batter is out”
    	int batter=bases.nextInt(5);
    	if(batter==0) {
    		JOptionPane.showMessageDialog(null, "The batter is out");
    		 	}
    	
   	 // 3. Otherwise display “the batter hit a ” and “single”, “double”, “triple” or “home run”
if(batter==1) {
	JOptionPane.showMessageDialog(null, "The batter hit a single");
	robo.turn(45);
	robo.setPenColor(Color.blue);
	robo.setSpeed(100);
	robo.penDown();
	robo.move(200);
	}
if(batter==2) {
JOptionPane.showMessageDialog(null, "The batter hit a double");
robo.turn(45);
robo.penDown();
robo.setPenColor(Color.blue);
robo.move(200);
robo.turn(-90);
robo.move(200);

}
if(batter==3) {
JOptionPane.showMessageDialog(null, "The batter hit a triple");
robo.turn(45);
robo.penDown();
robo.setPenColor(Color.blue);
robo.penDown();
robo.move(200);
robo.turn(-90);
robo.move(200);
robo.turn(-90);
robo.move(200);
}
if(batter==4) {
JOptionPane.showMessageDialog(null, "The batter hit a home run!!");

robo.turn(45);
robo.penDown();
robo.setPenColor(Color.blue);
robo.move(200);
robo.turn(-90);
robo.move(200);
robo.turn(-90);
robo.move(200);
robo.turn(-90);
robo.move(200);



}

   	 // 4. Make the robot draw the path of the base runner. For example, if 
	 //     the batter hit a double, draw a line from home plate to first and another line from
            //      first to second. Home plate should be at the bottom and first should be on the
            //      right. You do not need to draw the bases themselves or any other features.



    }

}
