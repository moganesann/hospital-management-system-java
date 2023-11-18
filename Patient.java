/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_system;
import java.util.Scanner;

public class Patient extends User{
    public Patient (String name,String id,String add,String num,String gender,String disease)
    {
       super(name,id,add,num,gender,disease) ;
    }
    Patient()
    {
   
            
    }
    @Override
    public void DisplayUser()
    {
    
           System.out.println(getname() +  "\t\t" +getid()+   "\t\t\t" + getadd() + "\t\t\t" + getnum() + "\t\t\t" + getgender() + "\t\t\t" + getdisease());
    }
    @Override
    public void displayUserList()
   {
     System.out.println("\n\t\t\t 1.Add Patient Profile");
     System.out.println("\n\t\t\t 2.Patient Records");
     System.out.println("\nYour Option(Choose NUMBER):");
    }
}

