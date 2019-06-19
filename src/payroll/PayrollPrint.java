/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.util.Scanner;

/**This class for
 * printing final salary including bonus
 * @author srinivsi
 */
public class PayrollPrint
{
public static void main(String[] args) 
{
/* here assumed that 50 employee accounts can be created
 for the given bank */
    double salary;
    String name;
    Payroll ac=new Payroll();
    Scanner sc=new Scanner(System.in);
 
    for(int i = 0; i < 41; i++){
        System.out.println("Please enter the employee name:");
        name = sc.nextLine();
        do {
            System.out.println("Please enter the salary: salary <=3000");
            salary = sc.nextDouble();
        } while (salary > 3000);
    System.out.println("The final Salary including bonus is: " + ac.calculation());
    }
}

}
