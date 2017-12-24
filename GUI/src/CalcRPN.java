import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class CalcRPN {

	private LinkedList<String> content;
	private int highestPriorityIndex;

	public CalcRPN(String equation) {
		this.content = new LinkedList<String>();
		String[] array = equation.split("((?<=\\D)|(?=\\D))");
		for (String e : array)
			content.add(e);
		highestPriorityIndex = 0;
	}
	
	public static void main(String[] args) {
		CalcRPN calc = new CalcRPN("11+5-3*4");
		System.out.println(calc.calculate());
	}
	
	public double calculate() {
		double result = 0;
		Stack<Double> stack = new Stack<Double>();
		convert();

		for (String e : content)
			if (checkIfNumber(e))
				stack.push(Double.parseDouble(e));
			else {
				stack.push(performOperation(e, stack.pop(), stack.pop()));
			}

		return stack.pop();
	}

	private void convert() {
		LinkedList<String> list = new LinkedList<String>();
		try {
			while (content.size() > 0) {
				for (int i = 0; i < content.size(); i++) {
					if (!checkIfNumber(content.get(i)))
						checkPriority(i);
				}

				try {
					list.add(content.get(this.highestPriorityIndex - 1));
					list.add(content.get(this.highestPriorityIndex + 1));
					list.add(content.get(this.highestPriorityIndex));
					content.remove(highestPriorityIndex + 1);
					content.remove(highestPriorityIndex);
					content.remove(highestPriorityIndex - 1);
					this.highestPriorityIndex = 0;

				} catch (IndexOutOfBoundsException e) {
					list.add(content.get(this.highestPriorityIndex));
					content.remove(highestPriorityIndex);
					this.highestPriorityIndex = 0;
				}
			}

		} catch (IndexOutOfBoundsException ex) {
			System.out.println(Arrays.toString(list.toArray()));
			System.out.println("out of bound2");
		}

		this.content = list;
	}

	private double performOperation(String operator, double num1, double num2) {
		double result = 0;

		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if (num2 != 0)
				result = num1 / num2;
			else {
				System.out.println("ZERO DIVISION ERROR");
				result = -1;
			}
			break;
		}
		return result;
	}

	private boolean checkIfNumber(String string) {
		try {
			Integer.parseInt(string);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private void checkPriority(int index) throws IndexOutOfBoundsException {
		switch (content.get(index)) {
		case "+":
			if (this.highestPriorityIndex == 0)
				this.highestPriorityIndex = index;
			break;
		case "-":
			if (this.highestPriorityIndex == 0)
				this.highestPriorityIndex = index;
			break;
		case "*":
			if (this.highestPriorityIndex == 0)
				this.highestPriorityIndex = index;
			else if (content.get(this.highestPriorityIndex).equals("+")
					|| content.get(this.highestPriorityIndex).equals("-"))
				this.highestPriorityIndex = index;
			break;
		case "/":
			if (this.highestPriorityIndex == 0)
				this.highestPriorityIndex = index;
			else if (content.get(this.highestPriorityIndex).equals("+")
					|| content.get(this.highestPriorityIndex).equals("-"))
				this.highestPriorityIndex = index;
			break;
		}
	}
}
