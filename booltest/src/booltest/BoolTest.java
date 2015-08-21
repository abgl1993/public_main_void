package booltest;

class BoolTest {
  public static void main(String[] args) {
    boolean bool;
    bool = false;
    System.out.println("b is " + bool);
    bool = true;
    System.out.println("b is " + bool);
    // a boolean value can control the if statement
    if (bool) { 
      System.out.println("This is executed.");
    }
    bool = false;
    if (bool) {
      System.out.println("This is not executed.");
    }
    // outcome of a relational operator is a boolean value
    System.out.println("10 > 9 is " + (10 > 9));
  }
}