import javax.swing.JOptionPane;

public class Prime {
	public static void main(String[] args) {
		String ans = JOptionPane.showInputDialog("Insert a number below");
		int ansNumber = Integer.parseInt(ans);
		if (ansNumber < 2) {
			JOptionPane.showMessageDialog(null, "Your number is not prime!");
System.exit(0);
		}
		for (int i = 2; i < ansNumber; i++) {
			if (ansNumber % 2 == 0) {
				JOptionPane.showMessageDialog(null, "You're number is not prime!");
				System.exit(0);
			}
			
		}
		for (int i = 2; i < ansNumber; i++) {
			if(ansNumber%3==0) {
				JOptionPane.showMessageDialog(null, "You're number is not prime");
				System.exit(0);
			}
			}
		JOptionPane.showMessageDialog(null, "You're number is PRIME!");
		System.exit(0);
		}
	
	
	
		
		
	}


