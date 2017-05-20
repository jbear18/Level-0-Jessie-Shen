


// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String  superPowerOne= "flying";
String superPowerTwo="invisibility";
String superPowerThree="jumping";
String superPowerFour="super speed";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String word=		JOptionPane.showInputDialog("Choose a superhero");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if(word.equals("Batman")){
	JOptionPane.showMessageDialog(null, superPowerOne);
}
	if(word.equals("X-Men")){
	JOptionPane.showMessageDialog(null, superPowerTwo);
	}
	if(word.equals("Kangaroo")){
		JOptionPane.showMessageDialog(null, superPowerThree);
		if(word.equals("the Flash")){
		}
		JOptionPane.showMessageDialog(null, superPowerFour);
}
	}}


