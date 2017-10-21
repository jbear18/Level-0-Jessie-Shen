import javax.swing.JOptionPane;

public class MovieRating {
public static void main(String[] args) {
String age=JOptionPane.showInputDialog("How old are you?");
int ansNumber = Integer.parseInt(age);
	if(ansNumber>17) {
		JOptionPane.showMessageDialog(null, "You can watch any movie you want!");
		}
	if(ansNumber>-1 &&ansNumber <18) {
		
	JOptionPane.showMessageDialog(null, "You must have a parent to watch a movie");
	}
	if(ansNumber<0) {
		JOptionPane.showMessageDialog(null, "ERROR OCCURED.");
	}
	}
}	

