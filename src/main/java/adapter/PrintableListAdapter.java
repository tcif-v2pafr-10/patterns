package adapter;

import java.util.List;

public class PrintableListAdapter implements PrintableList {

	public void printList(List<String> list) {

		// Converting ArrayList<String> to String so that we can pass String to
		// adaptee class
		StringBuffer listString = new StringBuffer();

		for (String s : list) {
			listString.append(s).append("\t");
		}

		// instantiating adaptee class
		PrintString printString = new PrintString();
		printString.print(listString.toString());
	}
}