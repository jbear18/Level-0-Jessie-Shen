
	import javax.swing.JOptionPane;

	public class SleepyHead {

		public static void main(String[] args) {
			
			boolean isWeekday, isVacation;
			
			/*
			 * Ask the user for these values using
			 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
			 * JOptionPane.YES_NO_OPTION);
			 */
	int x= JOptionPane.showConfirmDialog(null, "Is it a weekday?","",JOptionPane.YES_NO_OPTION);
			if(x==0) {
		isWeekday=true;	
			}else {
			isWeekday=false;
				
			}
		x= JOptionPane.showConfirmDialog(null, "Is it a vacation day?","",JOptionPane.YES_NO_OPTION);
		if(x==0) {
			isVacation=true;		
		}else {
			isVacation=false;
			
			
		}
			/*
			 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
			 * print “get up lazybones!” If it is a weekday, and we are on vacation,
			 * print “sleep in”.
			 */
		
		if(isWeekday&&!isVacation) {
			JOptionPane.showMessageDialog(null, "Get up lazybones!");
			
		}	
		
		
		
if(isWeekday&&isVacation) {
	JOptionPane.showMessageDialog(null, "Sleep in!");
}

if(!isWeekday)	{
JOptionPane.showMessageDialog(null, "Sleep in");

}
		
		}	
		
	}
		
	
	


