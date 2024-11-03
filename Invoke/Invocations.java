// rudimentary testing of Invoke methods
public class Invocations {
  // method main(): program starting point
  public static void main(String[] args) {
    System.out.println("\nTrying piggyBank() \n");

    int p1 = 3;   int p2 = 4;
    int n1 = 1;   int n2 = 5;
    int d1 = 4;   int d2 = 6;
    int q1 = 1;   int q2 = 7;
    int h1 = 5;   int h2 = 8;
    //	****** uncomment next four lines after completing piggyBank()
    int c1 = Invoke.piggyBank( p1, n1, d1, q1,	h1);
    int c2 = Invoke.piggyBank( p2, n2, d2, q2,	h2);

    System.out.println("Invoke.piggyBank(" + p1 + ", " + n1 + ", " +	d1 + ", " + q1 + ", " + h1 + "): " + c1);
    System.out.println("Invoke.piggyBank(" + p2 + ", " + n2 + ", " +	d2 + ", " + q2 + ", " + h2 + "): " + c2 );

    System.out.println("\nTrying mp3Sizer()");

    int s1 = 2000;   int s2 = 1350;
    int m1 = 25;     int m2 = 50;
    int j1 = 1500;   int j2 = 4000;

    //	****** uncomment next four	lines	after	completing mp3Sizer()
    int g1 = Invoke.mp3Sizer( s1, m1, j1 );
    int g2 = Invoke.mp3Sizer( s2, m2, j2 );

    System.out.println("Invoke.mp3Sizer(" + s1 + ", " + m1 + ", " + j1 + "): " + g1);
    System.out.println("Invoke.mp3Sizer(" + s2 + ", " + m2 + ", " + j2 + "): " + g2);
  }
}

