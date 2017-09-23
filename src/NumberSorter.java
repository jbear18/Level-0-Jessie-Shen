import javax.swing.JOptionPane;

public class NumberSorter {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Enter your first number.");
		int int1 = Integer.parseInt(num1);
		String num2 = JOptionPane.showInputDialog("Enter your second number.");
		int int2 = Integer.parseInt(num2);
		String num3 = JOptionPane.showInputDialog("Enter your third number.");
		int int3 = Integer.parseInt(num3);
		if (int1 < int2 && int1 < int3) {
			System.out.println(int1);

			if (int2 < int3) {
				System.out.println(int2);
				System.out.println(int3);
			} else {

				System.out.println(int3);
				System.out.println(int2);
			}
		}
		if (int2 < int1 && int2 < int3) {
			System.out.println(int2);
			if (int3 < int1) {
				System.out.println(int3);
				System.out.println(int1);
			}
		else {
			System.out.println(int1);
			System.out.println(int3);
		}
		}
		if (int3 < int1 && int3 < int2) {
			System.out.println(int3);
			if (int2 < int1) {
				System.out.println(int2);
				System.out.println(int1);
			}
		else {
			System.out.println(int1);
			System.out.println(int2);
		}
		}
		
		
	}
}
