import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Point p1 = new Point();
		Point p2 = new Point();

		System.out.println("Inserisci x1:");
		double x1 = in.nextDouble();
		System.out.println("Inserisci y1:");
		double y1 = in.nextDouble();
		System.out.println("Inserisci x2:");
		double x2 = in.nextDouble();
		System.out.println("Inserisci y2:");
		double y2 = in.nextDouble();

		p1.setX(x1);
		p1.setY(y1);
		p2.setX(x2);
		p2.setY(y2);

		System.out.println("La distanza tra i due punti: " + p1.distance(p2));

		in.close();

	}

}
