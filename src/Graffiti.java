import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Graffiti {
public static void main(String[] args) {
	Robot jeff=new Robot("mini");
jeff.setRandomPenColor();
jeff.setSpeed(10);
jeff.setPenWidth(10);
jeff.sparkle();
jeff.penDown();
jeff.move(100);	
jeff.turn(90);	
jeff.move(50);
jeff.turn(90);
jeff.move(100);
jeff.turn(270);
jeff.move(90);
jeff.turn(270);
jeff.move(100);
jeff.turn(90);
jeff.move(140);
jeff.turn(90);
jeff.move(140);
jeff.turn(270);
jeff.move(77);
jeff.turn(270);
jeff.move(44);
jeff.setAngle(45);
jeff.move(23);
jeff.turn(315);
jeff.move(23);
jeff.turn(315);
jeff.move(23);
jeff.turn(180);
jeff.move(45);
jeff.turn(45);
jeff.move(77);
jeff.turn(270);
jeff.move(66);
jeff.hide();

}
}