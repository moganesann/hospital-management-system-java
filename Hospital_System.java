/*

This is done by Moganesan Veragu (CB19095)

 */

package hospital_system;
import java.util.Scanner;
public class Hospital_System {
public static void main(String[] args) {
    
   String log,pass;
   String name,add,num,gender,disease,id,n;
   String namee,type,ide,dep,nume;
   String namel,idl,typel,namecharge;
   String namem,func,usage,date;
   int option = 0,sel,ret;
   int pati = 0, i = 0, emp = 0,s = 0, labb = 0, l = 0, med = 0, m = 0;
   Scanner sc = new Scanner(System.in);
   
   User Patient [] = new Patient[10];
   Patient[0]= new Patient ("Syafiq","CB19095","83,Jln Murni,Tmn Murni","0125589672","Male","Diabetes");
   Patient[1]= new Patient ("Rahim","CD34095","23,Jln Gurun,Tmn Gurun","0125456662","Male","Fever");
   Patient[2]= new Patient ("Yi Heng","CA45095","63,Jln Warni,Tmn Warni","0127582642","Female","Diabetes");
   UserEmp Employee [] = new Employee [10];
   Employee[0]= new Employee ("Vinayak   "," Doctor","MH8912","Medical","0125589672");
   Employee[1]= new Employee ("Abdullah","Staff","MJ3429","Pharmac","0125456662");
   Employee[2]= new Employee ("Chee Kin","Doctor","MH8861","Radiolo","0127582642");
   UserLabb Lab [] = new Lab [10];
   Lab[0]= new Lab ("Kenari","A12","Chemistry","Zahid");
   Lab[1]= new Lab ("Desaru","C34","Surgical","Lingges");
   Lab[2]= new Lab ("Mawari","F01","Cytology","Graham");
   UserMed Medicine [] = new Medicine [10];
   Medicine[0]= new Medicine ("Ativan","       anxiety disorders","1","22/11/25");
   Medicine[1]= new Medicine("Cymbalta","depressive disorder","1","23/05/22");
   Medicine[2]= new Medicine ("Entresto","receptor blocker","1","12/02/26");
   

   System.out.println("\t\t============================================================");
   System.out.println("\t\t=======================  LOGIN FORM  =======================");
   System.out.println("\t\t====================== Login ID:hello ======================");
   System.out.println("\t\t===================== Password:welcome =====================");
   System.out.println("\n\t\t           Enter Login-ID(hello):           ");
   log = sc.nextLine();
   System.out.println("\t\t           Enter Password(welcome):           ");
   pass = sc.nextLine();
   if( log.equals("hello") && pass.equals("welcome")){
   System.out.println("\t\t=================================================");
   System.out.println("\t\t|           HOSPITAL MANAGEMENT SYSTEM           |");
   System.out.println("\t\t=================================================");
   System.out.println("\t\t|         -----------------------------          |");
   System.out.println("\n\t\t\t\t   MAIN MENU");
   System.out.println("\t\t\t\t   ---------");
   System.out.println("\n\t\t\t 1.Patient");
   System.out.println("\n\t\t\t 2.Doctor/Staff");
   System.out.println("\n\t\t\t 3.Lab");
   System.out.println("\n\t\t\t 4.Medicine");
   System.out.println("\t\t-------------------------------------------------");
   System.out.println("\nEnter the Option(Choose NUMBER) : ");
   option = sc.nextInt();
   }
   else{
       System.out.println("\n\t\t        SORRY,INVALID LOGINID/PASSWORD.");
       System.out.println("\t\t        PLEASE TRY LOGIN AGAIN. (LOGINID:hello    PASSWORD:welcome)");
   }
       
   {

   switch(option)
   {
       case 1 : 
       {
     System.out.println("\n\t\t=================================================");
     System.out.println("\t\t\t PATIENT SECTION");
     System.out.println("\t\t=================================================");
     ret = 1;
     while (ret == 1)
        {
          Patient[i].displayUserList();
          sel = sc.nextInt();                
                           if (sel == 1)
                            {
                            for(int x=4 + pati; x < Patient.length; x++)
                               {
                               n=sc.nextLine();
                               System.out.println("Enter Name:");
                               name=sc.nextLine();
                               System.out.println("Enter ID Number:");
                               id=sc.nextLine();
                               System.out.println("Enter Gender:");
                               gender=sc.nextLine();
                               System.out.println("Enter  Address:");
                               add=sc.nextLine();
                               System.out.println("Enter Phone Number:");
                               num=sc.nextLine();
                               System.out.println("Enter Disease/Illness:");
                               disease=sc.nextLine();
                               Patient[x]= new Patient(name,id,add,num,gender,disease);
                               pati += 1;
                               break;
                               }
                            }
                           else if (sel ==2)
                            {
                             System.out.println("\n\n-----------------------------------------------------------------------------------------------------------------------------------------------------------");
                             System.out.println("Name  \t\t ID Num  \t\t Address  \t\t\t\t Phone Number  \t\t\t Gender  \t\t Disease  ");
                             System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
                             for(int x=0; x < Patient.length; x++)
                            { 
                              if(Patient[x] != null)
                                 {
                                  Patient[x].DisplayUser();
                                 }
                            }
                            }
                           else
                            {
                              System.out.println("INVALID OPTION");
                            }
                System.out.println("\nReturn to Home Screen(PRESS 1)//Exit(PRESS 0) :");
                ret = sc.nextInt();
                }
                break;
                }
        case 2 : 
         {
            System.out.println("\n\t\t=================================================");
            System.out.println("\t\t\t DOCTOR/STAFF SECTION");
            System.out.println("\t\t=================================================");
                ret = 1;
                while (ret == 1)
                 {
                   Employee[s].displayUserListEmp();
                   sel = sc.nextInt();                
                     if (sel == 1)
                           {
                             for(int r=4 + emp; r < Employee.length; r++)
                                {
                                 n=sc.nextLine();
                                 System.out.println("Enter Name:");
                                 namee=sc.nextLine();
                                 System.out.println("Enter Type(Doctor/Staff):");
                                 type=sc.nextLine();
                                 System.out.println("Enter Department ID:");
                                 ide=sc.nextLine();
                                 System.out.println("Enter Department:");
                                 dep=sc.nextLine();
                                 System.out.println("Enter Phone Number:");
                                 nume=sc.nextLine();
                                 Employee[r]= new Employee(namee,type,ide,dep,nume);
                                 emp += 1;
                                 break;
                               }
                            }
                           else if (sel ==2)
                            {
                             System.out.println("\n\n------------------------------------------------------------------------------------------------------");
                             System.out.println("Name    \t\t Type  \t\t ID  \t\t Department  \t\tPhone Number");
                             System.out.println("------------------------------------------------------------------------------------------------------");
                             for(int r=0; r < Employee.length; r++)
                            { 
                              if(Employee[r] != null)
                                 {
                                  Employee[r].DisplayUserEmp();
                                 }
                            }
                            }
                           else
                            {
                              System.out.println("INVALID OPTION");
                            }
                System.out.println("\nReturn to Home Screen(PRESS 1)//Exit(PRESS 0) :");
                ret = sc.nextInt();
                }
                break;
                }
    case 3 :
               {
                System.out.println("\n\t\t=================================================");
                System.out.println("\t\t\t LAB SECTION");
                System.out.println("\t\t=================================================");
                ret = 1;
                while (ret == 1)
                {
                Lab[l].displayUserListLabb();
                sel = sc.nextInt();
                           if (sel == 1)
                            {
                             for(int j=4 + labb; j < Lab.length; j++)
                                {
                                 n=sc.nextLine();
                                 System.out.println("Enter Lab Name:");
                                 namel=sc.nextLine();
                                 System.out.println("Enter Lab ID:");
                                 idl=sc.nextLine();
                                 System.out.println("Enter Lab Type:");
                                 typel=sc.nextLine();
                                 System.out.println("Enter In-Charge(Name) of Lab:");
                                 namecharge=sc.nextLine();
                                 Lab[j]= new Lab(namel,idl,typel,namecharge);
                                 labb += 1;
                                 break;
                               }
                            }
                           else if (sel ==2) 
                            {
                             System.out.println("\n\n--------------------------------------------------------------------------------------------");
                             System.out.println("Lab Name  \t\tLab ID  \t\t Lab Type  \t\tLab In-Charge");
                             System.out.println("--------------------------------------------------------------------------------------------");
                             for(int j=0; j < Lab.length; j++)
                            { 
                              if(Lab[j] != null)
                                 {
                                  Lab[j].DisplayUserLabb();
                                 }
                            }
                            }
                           else
                            {
                              System.out.println("INVALID OPTION");
                            }
                System.out.println("\nReturn to Home Screen(PRESS 1)//Exit(PRESS 0) :");
                ret = sc.nextInt();
                }
                break;
                }
        case 4 :
               {
                System.out.println("\n\t\t=================================================");
                System.out.println("\t\t\t MEDICINE SECTION");
                System.out.println("\t\t=================================================");
                ret = 1;
                while (ret == 1)
                {
                Medicine[m].displayUserListMed();
                sel = sc.nextInt();
                
                           if (sel == 1)
                            {
                            for(int h=4 + med; h < Medicine.length; h++)
                                {
                                 n=sc.nextLine();
                                 System.out.println("Enter Medicine Name:");
                                 namem=sc.nextLine();
                                 System.out.println("Enter Medicine Function:");
                                 func=sc.nextLine();
                                 System.out.println("Enter Medicine Usage(per Day): ");
                                 usage=sc.nextLine();
                                 System.out.println("Enter  Medicine Expiry Date:");
                                 date=sc.nextLine();
                                 Medicine[h]= new Medicine(namem,func,usage,date);
                                 med += 1;
                                 break;
                               }
                            }
                           else if (sel ==2) 
                            {
                             System.out.println("\n\n---------------------------------------------------------------------------------------------------------------------");
                             System.out.println("Medicine Name  \t\tMedicine Function  \t\t Medicine Usage(per Day)  \t\tMedicine Expiry Date");
                             System.out.println("---------------------------------------------------------------------------------------------------------------------");
                           for(int h=0; h < Medicine.length; h++)
                            { 
                              if(Medicine[h] != null)
                                 {
                                  Medicine[h].DisplayUserMed();
                                 }
                            }
                            }
                           else
                            {
                              System.out.println("INVALID OPTION");
                            }
                System.out.println("\nReturn to Home Screen(PRESS 1)//Exit(PRESS 0) :");
                ret = sc.nextInt();
                }
                break;
                }
              default:
                    {
                        System.out.println(" Sorry,You Have Entered The Wrong Option!!");
                    }
}
}
}
}
