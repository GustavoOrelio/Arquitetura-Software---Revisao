import javax.swing.JOptionPane;

public class InvertValue {

	public static void main(String Args[]) {

		String number = JOptionPane.showInputDialog("Enter the numbers separated by ,");
		String values[] = InvertValue.separeteComma(number);

		System.out.println(reverseValues(values));
	}

	/**
	 * Método para fazer a separação de uma string utilizando a virgula como escape
	 **/
	private static String[] separeteComma(String number) {
		return number.split(",");
	}

	private static String reverseValues(String[] values) {
		String exit = "";

		for (int x = values.length - 1; x >= 0; x--) {

			if (exit.length() == 0) {
				exit = values[x];
			} else {
				exit += ", " + values[x];
			}
		}
		return exit;
	}
}
