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
public class trianglearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base's Length -> ");
        double baselength = sc.nextDouble();
        System.out.print("Height -> ");
        double height = sc.nextDouble();
        double trianglearea = (baselength*height)/2;
        System.out.println("Triangle Area => " + trianglearea);
    }
}
