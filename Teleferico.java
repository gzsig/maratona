import java.util.Scanner;

public class Teleferico {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int c, a, viagens;
    double res;
    // System.out.println("value of c?");
    c = keyboard.nextInt();
    // System.out.println("value of a?");
    a = keyboard.nextInt();

    res = (a) % (c - 1);
    if (res > 0) {
      viagens = (a / (c - 1)) + 1;
    } else {
      viagens = a / (c - 1);
    }
    System.out.println("viagens: " + viagens);

    keyboard.close();
  }
}