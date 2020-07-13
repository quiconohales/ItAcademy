package com.vehicles.project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCommons {

	private Scanner input;

	public InputCommons(Scanner input) {
		this.input = input;
	}

	/**
	 * Metod for ask a string by console Previously displays the message passed by
	 * parameter in console
	 */
	public String askString(String questionMessage) {

		System.out.println(questionMessage);
		String answer = this.input.nextLine();

		return answer;
	}

	public String askCarRegistration(String questionMessage) {

		System.out.println(questionMessage);
		String answer = "";
		while (!(answer.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$"))) {

			answer = this.input.nextLine();
			if (!(answer.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$"))) {
				System.out.println("Card registration is invalid");
			}
		}
		return answer;
	}

	/**
	 * An integer number is requested per console If it does not have a valid
	 * integer format or the number is not in the range of "minInt" and "maxInt"
	 * parameters are reported screen error and re-requested a number to the user
	 * Returns the number entered by console
	 */
	public int askOption(int minInt, int maxInt) {
		return askInt(" Choose an option by entering a number between :", minInt, maxInt);
	}

	public int askOptionBC(int minInt, int maxInt) {
		return askInt("Select a option (1-Bike 2-Car):", minInt, maxInt);
	}

	/**
	 * An integer number is requested per console If it does not have a valid
	 * integer format or the number is not in the range of "minInt" and "maxInt"
	 * parameters are reported screen error and re-requested a number to the user
	 * Returns the number entered by console
	 */
	public int askInt(String questionMessage, int minInt, int maxInt) {

		int option = 0;
		boolean numberFormat = false;

		System.out.println(questionMessage);

		while (numberFormat == false) {
			try {

				option = this.input.nextInt();
				if (option >= minInt && option <= maxInt) {
					numberFormat = true;
				} else {
					System.out.println("Choose an option by entering a number between " + minInt + " and " + maxInt);
				}

			} catch (InputMismatchException e) {

				System.out.println("Choose an option by entering a number between " + minInt + " and " + maxInt);

			}
			this.input.nextLine();
		}

		return option;
	}

	/**
	 * The user is asked to enter a number with or without decimals per console As
	 * long as the value entered by the user does not have a correct numeric format
	 * it is still requested enter the number again by console
	 */
	public double askDouble(String questionMessage) {

		double number = 0;
		boolean numberFormat = false;

		System.out.println(questionMessage);

		while (numberFormat == false) {
			try {

				number = this.input.nextDouble();
				numberFormat = true;

			} catch (InputMismatchException e) {

				System.out.println("The value is not valid. ");

			}
			this.input.nextLine();
		}

		return number;
	}

	public double askDoubleValidate(String questionMessage) {

		double number = 0;
		boolean numberFormat = false;

		System.out.println(questionMessage);

		while (numberFormat == false) {
			try {

				number = this.input.nextDouble();
				if (number < 4 && number > (0.4)) {
					numberFormat = true;
				} else {
					numberFormat = false;
				}

			} catch (InputMismatchException e) {

				System.out.println("The value is not valid. ");

			}
			this.input.nextLine();
		}

		return number;
	}
    
	/**
	 * Pause for console to be able to view the latest messages until
	 * the user presses the ENTER key for console
	*/

	public void pause() {
		System.out.println("Press a the key ENTER to continue...");
		this.input.nextLine();
	}

}
