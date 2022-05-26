public class MathApp {
  public static void main(String[] args) {
    // Problem #1
    int job1Salary = 28000;
    int job2Salary = 89000;
    System.out.println(Math.max(job1Salary, job2Salary));
    // Problem #2
    int carPrice = 10000;
    int truckPrice = 48000;
    System.out.println(Math.min(carPrice, truckPrice));
    // Problem #3
    double radius = 7.25;
    double area = (radius * radius) * Math.PI;
    System.out.println(area);
    // Problem #4
    double num1 = 5.0;
    double squareRoot = Math.sqrt(num1);
    System.out.println(squareRoot);
    // Problem #5
    double x1 = 5;
    double y1 = 10;
    double x2 = 85;
    double y2 = 50;
    double distance = Math.hypot(x1 - x2, y1 - y2);
    System.out.println(distance);
    // Problem #6
    double num2 = -3.8;
    double absoluteP = Math.abs(num2);
    System.out.println(absoluteP);
    // Problem #7
    double randomNum = Math.random();
    System.out.println(randomNum);
  }
}
