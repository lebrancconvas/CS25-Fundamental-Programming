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
public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Width -> ");
        double width = sc.nextDouble();
        System.out.print("Height -> ");
        double height = sc.nextDouble();
        double area = width*height;
        System.out.println("Rectangle Area => " + area);
    }
}
