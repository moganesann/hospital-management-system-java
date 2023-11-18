/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_system;
abstract public class UserMed {
    
    public String namem,func,usage,date;
            
    public UserMed(String namem,String func,String usage,String date)   
    {
        this.namem = namem;
        this.func = func;
        this.usage = usage;
        this.date = date;
    }
    
    public UserMed()
    {
        
    }
    
    public String getnamem(){
        return namem;
    }
    public String getfunc(){
        return func;
    }
      public String getusage(){
        return usage;
    }
       public String getdate(){
        return date;
    }
    public void setnamem(String namem){
        this.namem=namem;
    }
    public void setfunc(String func){
        this.func=func;
    }
     public void setusage(String usage){
        this.usage=usage;
    }
     public void setdate(String date){
        this.date=date;
   }
        
        public abstract void DisplayUserMed();
        public abstract void displayUserListMed();
        
}
