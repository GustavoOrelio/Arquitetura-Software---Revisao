

import java.nio.file.attribute.AclEntry;
import javax.swing.JOptionPane;

public class AgeChecker {

	public static void main(String Args[]) {

		int age;
		try {
			age = Integer.parseInt(JOptionPane.showInputDialog("Write your age"));

			if (age < 12) {
				System.out.println("Children");
			} else if (age >= 12 && age < 18) {
				System.out.println("Teenager");
			} else if (age >= 18 && age < 60) {
				System.out.println("Adult");
			} else if (age >= 60 && age < 115) {
				System.out.println("Oldman");
			} else {
				System.out.println("Invalid age!");
			}

		} catch (Exception e) {
			System.out.println("Error because you didn´t type a number!");
		}

	}
}