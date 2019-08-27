import java.util.ArrayList;
import java.util.Scanner;

public class Binary {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    ArrayList<Integer> binary = new ArrayList<Integer>();
    char[] try1;
    int decimal, binInt;
    String aux, bin;

    System.out.println("decimal: ");
    decimal = keyboard.nextInt();

    aux = "";
    bin = "";

    while (decimal > 0) {
      binInt = decimal % 2;
      decimal = decimal / 2;
      binary.add(binInt);
    }

    for (Integer i : binary) {
      aux += i;
    }

    try1 = aux.toCharArray();

    for (int i = try1.length - 1; i >= 0; i--)
      bin += try1[i];

    System.out.println(bin);

    keyboard.close();
  }
}
