/**
 * 
 */
package gitter;

/**
 * @author robinkolze
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		gitter(1, 1);
		br();
		gitter(3, 3);
		br();
		gitter(5, 5);

	}

	public static void gitter(int breite, int hoehe) {
		print(breite + "x" + hoehe);
		
		boolean pipe = false;
		for (int i = 0; i < (hoehe * 2) + 1; i++) {
			boolean bplus = true;
			String bStr = "";

			for (int j = 0; j < breite * 2; j++) {
				if (pipe) {
					if (bplus)
						bStr += "|";
					else
						bStr += " ";
				} else {
					if (bplus)
						bStr += "+";
					else
						bStr += "-";
				}
				bplus = !bplus;
			}
			if (pipe)
				bStr += "|";
			else
				bStr += "+";

			print(bStr);

			pipe = !pipe;
		}

	}

	private static void br() {
		System.out.println("");
	}

	private static void print(String s) {
		System.out.println(s);
	}

}
