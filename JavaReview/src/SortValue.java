import javax.swing.JOptionPane;

public class SortValue {
	public static void main(String Args[]) {

		String number = JOptionPane.showInputDialog("Enter the numbers separated by ,");
		String values[] = SortValue.separeteComma(number);
		
		for (int i = 0; i < values.length; i++) {

			for (int j = 0; j < values.length - 1; j++) {

				if (values[j] != values[j + 1]) {

					String inteiroArmazenado = values[j];
					values[j] = values[j + 1];
					values[j + 1] = inteiroArmazenado;

				}

			}
		}
	
	       
		
		System.out.println(values);
	}
	
	private static String[] separeteComma(String number) {
		return number.split(",");
	}
}
