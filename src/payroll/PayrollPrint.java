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
    
    Payroll ac[]=new Payroll[50];
    Scanner sc=new Scanner(System.in);
 
    for(int i = 0; i < ac.length; i++){
        System.out.println("Please enter the employee name:");
        String name = sc.nextLine();
        double salary;
        do {
            System.out.println("Please enter the salary: salary <=3000");
            salary = sc.nextDouble();
        } while (salary > 3000);
    System.out.println("The final Salary including bonus is: " + ac[i].calculation());

       
    }
}

}
