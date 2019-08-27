import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TimeTravel {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    String res;
    // System.out.println("value of a?");
    list.add(keyboard.nextInt());
    // System.out.println("value of b?");
    list.add(keyboard.nextInt());
    // System.out.println("value of c?");
    list.add(keyboard.nextInt());

    Collections.sort(list);

    res = "";

    if (list.get(0) == list.get(1)) {
      res = "S";
    } else if (list.get(0) == list.get(2)) {
      res = "S";
    } else if (list.get(1) == list.get(2)) {
      res = "S";
    } else if (list.get(0) + list.get(1) == list.get(2)) {
      res = "S";
    } else {
      res = "N";
    }

    System.out.println("viagen? " + res);

    keyboard.close();
  }
}