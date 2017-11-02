import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Lvl0PracticeExam {
public static void main(String[] args) {
//	for (int i = 15; i > 4; i--) {
//	System.out.println(i);
//	}
//	Robot pi=new Robot("batman");
//	
//	pi.penDown();
//	pi.move(200);
//	pi.turn(90);
//	pi.move(200);
//	pi.turn(90);
//	pi.move(200);
//	pi.turn(90);
//	pi.move(200);
//	 JOptionPane.showMessageDialog(null, "nizzle?");
//	String ans= JOptionPane.showInputDialog("moms name");
//	JOptionPane.showMessageDialog(null, "Good Morning "+ans);
	String lucysHeight= JOptionPane.showInputDialog("How tall is Lucy?");
	int lucy=Integer.parseInt(lucysHeight);
	String jimmyheight= JOptionPane.showInputDialog("How tall is Jimmy?");
	int jimmy =Integer.parseInt(jimmyheight);
if(lucy>jimmy) {
	JOptionPane.showMessageDialog(null, "Lucy is taller");	
}
if(jimmy>lucy) {

JOptionPane.showMessageDialog(null, "Jimmy is taller");
}else {
JOptionPane.showMessageDialog(null, "They are both the same height.");


}












}
}

