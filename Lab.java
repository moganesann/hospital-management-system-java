/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_system;
import java.util.Scanner;

public class Lab extends UserLabb {
    public Lab (String namel,String idl,String typel,String nameCharge)
    {
      super(namel,idl,typel,nameCharge) ;
    }
    Lab()
    {
   

    }
    
    @Override
    public void DisplayUserLabb()
    {
    
           System.out.println(getnamel() + "\t\t\t" + getidl() + "\t\t\t"  + gettypel() + "\t\t\t" +getnameCharge() );
    }
    @Override
    public void displayUserListLabb()
   {
                System.out.println("\n\t\t\t 1.Add Lab Details");
                System.out.println("\n\t\t\t 2.Lab Records");
                System.out.println("\nYour Option(Choose NUMBER):");
    }
}
