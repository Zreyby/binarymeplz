package com.miracle.binarymeplz;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Main {

	public static void main(String[] args) throws IOException {
		char[] letterArr = new char[]{
				'a',
				'b',
				'c',
				'd',
				'e',
				'f',
				'g',
				'h'	,
				'i'	,
				'j'	,
				'k'	,
				'l'	,
				'm'	,
				'n'	,
				'o'	,
				'p'	,
				'q'	,
				'r'	,
				's'	,
				't'	,
				'u'	,
				'v'	,
				'w'	,
				'x'	,
				'y'	,
				'z'};
		
		String[] binaryArr = new String[]{
				"01100001",
				"01100010",
				"01100011",
				"01100100",
				"01100101",
				"01100110",
				"01100111",
				"01101000",
				"01101001",
				"01101010",
				"01101011",
				"01101100",
				"01101101",
				"01101110",
				"01101111",
				"01110000",
				"01110001",
				"01110010",
				"01110011",
				"01110100",
				"01110101",
				"01110110",
				"01110111",
				"01111000",
				"01111001",
				"01111010"};
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		ArrayList<String> newBinStr = new ArrayList<String>();
		int choose;
		out.print("Enter EN text in lower case\n");
		out.print(">> ");
		String enteredText = scan.nextLine();
		
		for (int i = 0; i < enteredText.length(); i++) {
			for (int j = 0; j < letterArr.length; j++) {
				if (letterArr[j] == enteredText.toCharArray()[i]) {
					out.print(binaryArr[i] + " ");
					newBinStr.add(binaryArr[i]);
				}
			}
		}
		out.println();
		out.println("[1] - Copy to clipboard");
		out.println("[2] - Try again");
		out.println("[3] - Exit");
		
		choose = scan.nextInt();
		
		switch (choose) {
		case 1:

			StringSelection selectStr = new StringSelection(newBinStr.toString()
															.replace('[', ' ')
															.replace(']', ' ')
															.replace(',', ' '));
			Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
			clip.setContents(selectStr, selectStr);
			break;
			
		case 2:
			out.println("noup:3");
			System.exit(0);
			break;
			
		case 3:
			out.println("noup:3");
			System.exit(0);
			break;

		default:
			out.println("noup:3");
			System.exit(0);
			break;
		}
		
		in.read();
	}		
}
