package switch_loop;

public class simple_calculation {

	public static void main(String[] args) {

		int num1 = 15, num2 = 5, res;
		byte op = '%';
		switch (op) {
		case '+':
			res = +(num1 + num2);
			System.out.println(res);
			break;
		case '-':
			res = +(num1 - num2);
			System.out.println(res);
			break;
		case '*':
			res = +(num1 * num2);
			System.out.println(res);
			break;
		case '/':
			res = +(num1 / num2);
			System.out.println(res);
			break;
		case '%':
			res = +(num1 % num2);
			System.out.println(res);
			break;
		default:
			System.out.println("unknown operation");
			break;

		}

	}

}
