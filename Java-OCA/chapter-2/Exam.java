
public class Exam {

	public static void main(final String a[]) {

		/*
		 * Pregunta 2. ¿Que tipos permiten que compile?
		 */
		{
			final byte x = 5;
			final byte y = 10;

			final int z = x + y;
			final long z1 = x + y;
			final double z2 = x + y;
			// short z3 = x + y; --> No puede convertir de int a short
			// byte z4 = x + y; --> No puede convertir de int a byte
		}
		/*
		 * Pregunta 3. ¿Que devuelve?
		 */
		{
			int x = 0;
			while (x++ < 10) {
			}
			final String message = x > 10 ? "Greater than" : false;
			System.out.println(message + "," + x);
		}

		/*
		 * Pregunta 4. ¿Que cambiarias para que compile?
		 */
		{
			final long x = 10;

			final int y1 = (int) (2 * x);
			final int y2 = 2 * (int) x;
			final long y3 = 2 * x;
			final short y4 = 2 * x;

			final short x2 = 10;
			final int y5 = 2 * x2;
		}

		/*
		 * Pregunta . ¿Que devuelve?
		 */
		{
			final java.util.List<Integer> list = new java.util.ArrayList<>();
			list.add(10);
			list.add(14);
			for (final int x : list) {
				System.out.println(x + ",");
				break;
			}

			// devuelve --> 10,
			// recordar que el break devuelve el flujo fuera del bucle.
		}

		/*
		 * Pregunta 7. ¿Que devuelve?
		 */
		{
			final int x = 5;
			System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);

			// devuelve --> D
		}

		/*
		 * Pregunta 10. ¿Que devuelve?
		 */
		{
			final byte r = 40;
			final byte b = 50;
			final byte sum = r + b;
		}

	}
}
