import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    BigInteger price = BigInteger.ONE;
    BigInteger perPerson = BigInteger.ONE;
    Integer friends, items;

    items = keyboard.nextInt();
    friends = keyboard.nextInt();

    for(int i = 0; i < items; i++){
      price = price.add(keyboard.nextBigInteger());
    }

    perPerson = price.divide(BigInteger.valueOf(friends));

    System.out.println("costs " + price + ": each person should pay " + perPerson );

    keyboard.close();
  }
}