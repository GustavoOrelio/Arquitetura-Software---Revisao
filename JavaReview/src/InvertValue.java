import javax.swing.JOptionPane;

public class InvertValue {

	public static void main(String Args[]) {

		String number = JOptionPane.showInputDialog("Enter the numbers separated by ,");
		String values[] = number.split(",");
		String exit = "";

		for (int x = values.length - 1; x >= 0; x--) {
			
			if(exit.length() == 0) {
				exit = values[x];
			}else {
				exit += ", " + values[x] ;
			}
			// System.out.print(values[ x ]);
		}
		System.out.println(exit);
	}

}
