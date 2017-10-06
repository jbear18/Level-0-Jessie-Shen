import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		int x = JOptionPane.showConfirmDialog(null, "Are you happy?", "", JOptionPane.YES_NO_OPTION);
		if (x == 0) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing");

		} else {
			int y = JOptionPane.showConfirmDialog(null, "Do you want to be happy?", "", JOptionPane.YES_NO_OPTION);
			if (y == 0) {
				JOptionPane.showMessageDialog(null, "Change Something");

			} else {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
			}
		}

	}
}
