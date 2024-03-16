package _03_03b;

public class GradingSystem {

  public boolean isAPass(int percentage) {
    // Return true if the percentage is higher than or equal to 60.
    // Otherwise return false.
    if (percentage >= 60) {
      return true;
    } else {
      return false;

    }
  }

  public char getGrade(int percentage) {
    // If the percentage is 90 or above, return 'A'.
    // If it's 80-89, return 'B'.
    // If it's 70-79, return 'C'.
    // If it's 60-69, return 'D'.
    // If it's less than 60, return 'F'.
    if (percentage >= 90) {
      return 'A';
    } else if (percentage >= 80 && percentage <= 89) {
      return 'B';
    } else if (percentage >= 70 && percentage <= 79) {
      return 'C';
    } else if (percentage <= 60 && percentage <= 69) {
      return 'D';
    } else if (percentage < 60) {
      return 'F';
    } else {
      return 'X';
    }
  }

  public String retakeMessage(int percentage, boolean allowedToRetake) {
    // If percentage is less than 60 and allowedToRetake is true, return a String
    if (percentage < 60 && allowedToRetake == true) {
      return "he student has been entered for a retake.";
    }
    // that says "The student has been entered for a retake."
    // If percentage is less than 60 and allowedToRetake is false, return a String
    if (percentage < 60 && allowedToRetake == false) {
      return "he student is not allowed to retake this exam.";
    }
    // that says "The student is not allowed to retake this exam."
    // If percentage is 60 or higher, return a String that says "A retake is not
    if (percentage >= 60) {
      return "A retake is not required";
    }
    // required."
    else {
      return "";
    }

  }

}
