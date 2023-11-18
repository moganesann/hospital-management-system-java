/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_system;
import java.util.Scanner;

public class Employee extends UserEmp{
    public Employee (String namee,String type,String ide,String dep,String nume)
    {
       super(namee,type,ide,dep,nume) ;
    }
    Employee()
    {
   
            
    }
    @Override
    public void DisplayUserEmp()
    {
    
           System.out.println(getnamee() + "\t\t" + gettype() + "\t\t" + getide() + "\t\t"  + getdep() + "\t\t\t\t" +getnume() );
    }
    @Override
    public void displayUserListEmp()
   {
     System.out.println("\n\t\t\t 1.Add Doctor/Staff Profile");
     System.out.println("\n\t\t\t 2.Dcotor/Staff Records");
     System.out.println("\nYour Option(Choose NUMBER):");
    }
}
