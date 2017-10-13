import javax.swing.JOptionPane;

public class SpotTheError {
	
public static void main(String[] args) {
	String ans = JOptionPane.showInputDialog("Give me a number");
	int ansNumber = Integer.parseInt(ans);
	
	for (int i = 0; i < ansNumber; i++) {
		System.out.println(ansNumber);	
	}
	
	
	
}
}
