import javax.swing.JOptionPane;

public class AscendingOrder {
	public static void main(String[] args) {
		String values = JOptionPane.showInputDialog("Enter 03 values ​​separated by commas");
		values = OrderAscending(values);
		JOptionPane.showMessageDialog(null, values);
	}

	public static String OrderAscending(String value) {
		String values[] = value.split(",");
		int convertValues[] = new int[values.length];
		for (int i = 0; i < values.length; i++) {
			try {
				convertValues[i] = Integer.parseInt(values[i]);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "\r\n" + "Incorrect format");
			}
		}
		for (int j = 1; j < convertValues.length; j++) {
			int key = convertValues[j];
			int i = j - 1;
			while ((i > -1) && (convertValues[i] > key)) {
				convertValues[i + 1] = convertValues[i];
				i--;
			}
			convertValues[i + 1] = key;
		}
		for (int i = 0; i < values.length; i++) {
			values[i] = String.valueOf(convertValues[i]);
		}
		value = String.join(",", values);
		return value;
	}
}
