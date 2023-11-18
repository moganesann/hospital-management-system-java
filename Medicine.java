/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_system;
import java.util.Scanner;
public class Medicine extends UserMed {
    public Medicine (String namem,String func,String usage,String date)
    {
      super(namem,func,usage,date) ;
    }
    Medicine()
    {
   

    }
    
    @Override
    public void DisplayUserMed()
    {
    
           System.out.println(getnamem() + "\t\t" + getfunc() + "\t\t\t\t"  + getusage() + "\t\t\t\t" +getdate() );
    }
    @Override
    public void displayUserListMed()
   {
                System.out.println("\n\t\t\t 1.Add Medicine Details");
                System.out.println("\n\t\t\t 2.Medicine Records");
                System.out.println("\nYour Option(Choose NUMBER):");
    }
}
