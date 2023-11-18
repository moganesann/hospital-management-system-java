/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_system;
abstract public class UserLabb {
    
    public String namel,idl,typel,nameCharge;
            
    public UserLabb(String namel,String idl,String typel,String nameCharge)   
    {
        this.namel = namel;
        this.idl = idl;
        this.typel = typel;
        this.nameCharge = nameCharge;
    }
    
    public UserLabb()
    {
        
    }
    
    public String getnamel(){
        return namel;
    }
    public String getidl(){
        return idl;
    }
      public String gettypel(){
        return typel;
    }
       public String getnameCharge(){
        return nameCharge;
    }
    public void setnamel(String namel){
        this.namel=namel;
    }
    public void setidl(String idl){
        this.idl=idl;
    }
     public void settypel(String typel){
        this.typel=typel;
    }
      public void setnameCharge(String nameCharge){
        this.nameCharge=nameCharge;
    }

        
        public abstract void DisplayUserLabb();
        public abstract void displayUserListLabb();
        
}
