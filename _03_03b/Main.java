package _03_03b;

public class Main {

  public static void main(String[] args) {
    GradingSystem gradingSystem = new GradingSystem();
    int percentage = 85;
    System.out.println("Percentage: " + percentage);
    System.out.println("Pass: " + gradingSystem.isAPass(percentage));
    System.out.println("Grade: " + gradingSystem.getGrade(percentage));
    System.out.println(gradingSystem.retakeMessage(percentage, true));
  }

}
