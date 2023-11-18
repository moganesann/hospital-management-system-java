/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_system;
abstract public class UserEmp {
    
    public String namee,type,ide,dep,nume;
            
    public UserEmp(String namee,String type,String ide,String dep,String nume)   
    {
        this.namee = namee;
        this.type = type;
        this.ide = ide;
        this.dep = dep;
        this.nume = nume;
    }
    
    public UserEmp()
    {
        
    }
    
    public String getnamee(){
        return namee;
    }
    public String getide(){
        return ide;
    }
     public String getdep(){
        return dep;
    }
      public String gettype(){
        return type;
    }
       public String getnume(){
        return nume;
    }
    public void setnamee(String namee){
        this.namee=namee;
    }
    public void setide(String ide){
        this.ide=ide;
    }
     public void setdep(String dep){
        this.dep=dep;
    }
      public void setnume(String nume){
        this.nume=nume;
    }
      public void settype(String type){
        this.type=type;
    }
        
        public abstract void DisplayUserEmp();
        public abstract void displayUserListEmp();
        
}
