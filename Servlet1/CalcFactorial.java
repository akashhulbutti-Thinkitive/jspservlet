
public class CalcFactorial {

	public static int calcFactorialNumber(int num) {

		if (num <= 1)
			return 1;
		return calcFactorialNumber(num-1) * calcFactorialNumber(num);
		
	}
}
