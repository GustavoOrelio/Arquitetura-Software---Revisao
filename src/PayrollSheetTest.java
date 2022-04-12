import javax.swing.JOptionPane;

public class PayrollSheetTest {
	public static void main(String[] args) {
		Double hours = Double.parseDouble(JOptionPane.showInputDialog("Tell quantidade of hours"));
	Double hoursValue = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of the time worked"));
	
	PayrollSheet aliceLeaf = new PayrollSheet();
	aliceLeaf.setHourQuantities(hours);
	aliceLeaf.setHoursValue(hoursValue);
	System.out.println(aliceLeaf);
	}
}
