/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_system;
abstract public class User {
    
    public String name,id,add,num,gender,disease;
            
    public User(String name,String id,String add,String num,String gender,String disease)   
    {
        this.name = name;
        this.id = id;
        this.add = add;
        this.num = num;
        this.gender = gender;
        this.disease = disease;
    }
    
    public User()
    {
        
    }
    
    public String getname(){
        return name;
    }
    public String getid(){
        return id;
    }
    public String getadd(){
        return add;
    }
    public String getnum(){
        return num;
    }
    public String getgender(){
        return gender;
    }
    public String getdisease(){
        return disease;
    }

    public void setname(String name){
        this.name=name;
    }
    public void setadd(String add){
        this.add=add;
    }
    public void setid(String id){
        this.id=id;
    }
     public void setnum(String num){
        this.num=num;
    }
      public void setgender(String gender){
        this.gender=gender;
    }
      public void setdisease(String disease){
        this.disease=disease;
    }

        public abstract void DisplayUser();
        public abstract void displayUserList();
        
}
