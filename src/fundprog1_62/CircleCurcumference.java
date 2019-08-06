/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundprog1_62;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class CircleCurcumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.1416;
        System.out.print("Radian -> ");
        double radian = sc.nextDouble();
        double circumference = 2*PI*radian;
        System.out.println("Circumference => " + circumference);
    }
}
