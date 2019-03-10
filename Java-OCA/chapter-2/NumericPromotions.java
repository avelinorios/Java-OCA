
public class NumericPromotions {

	public static void main(final String a[]) {

		final int x = 2;
		final long y = 33;

		// int result = x * y; Da error porque no puede convertir un long a int.
		// Da igual que sea suma, resta, multiplicacion o division.
		final long result = x * y;
		System.out.println("Result 1: " + result);

		/*
		 * Operación entre double y float: devuelve double
		 */
		final double d = 39.54;
		final float f = 2.1f;

		final double result2 = d + f;
		System.out.println("Result 2: " + result2);

		/*
		 * Operación entre short y short: devuelve
		 */
		final short s1 = 10;
		final short s2 = 3;

		final short result3 = s1 / s2;
		System.out.println("Result 3: " + result3);

	}
}
