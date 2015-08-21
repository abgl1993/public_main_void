package dyninit;

class DynInit {
  public static void main(String[] args) {
    double a1 = 3.0;
    double b1 = 4.0;
    double c1 = Math.sqrt(a1 * a1 + b1 * b1);// c is dynamically initialized
    System.out.println("Hypotenuse is " + c1);
  }
}