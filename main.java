/*
 No parameter declare in these code take the input from the user
 */

import java.util.*;
public class main {
  public static void main(String[] args) {
    sum();
  }
  static void sum() {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b;
    
    System.out.println(sum);

  }

}