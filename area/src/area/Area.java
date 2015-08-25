package area;

class Area {
  public static void main(String[] args) {
    double pi;
    double radius;
    double area; 

    radius = 10.8; // radius of circle
    pi = 3.1416; // pi, approximately
    area = pi * radius * radius; // compute area

    System.out.println("Area of circle is " + area);
  }
}