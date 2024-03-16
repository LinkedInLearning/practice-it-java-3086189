package _03_04;

public class ForLoops {
  private static int x;

  public static void main(String[] args) {
    // Write a for loop that prints out the phrase "I love for loops" 5 times
    for (x = 0; x <= 5; x++) {
      System.out.println("I love for loops");
      System.out.println(x);
    }
    System.out.println("first loop ends.............");

    // Write a for loop that prints out the numbers 1 to 10
    for (x = 1; x < 11; x++) {
      System.out.println(x);
    }
    System.out.println("the second loop ends........");

    // Write a for loop that prints out the numbers 10 to 1
    for (x = 10; x > 0; x--) {
      System.out.println(x);
    }

  }

}
