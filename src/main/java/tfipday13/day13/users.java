package tfipday13.day13;

import java.io.File;
import java.io.Serializable;


public class users implements Serializable{
    public String name;
    public String phoneNum;
    public String emailAdd;
    public File filedirectory;

    public String getname(){
    return this.name;
}
public String getphoneNum(){
    return this.phoneNum;
}
public String getemailAdd(){
    return this.emailAdd;
}
public void setname(String name){
    this.name=name;
}
 public void setphoneNum(String number){
    this.phoneNum=number;
} 
public void setemailAdd(String email){
    this.emailAdd=email;
}
public File getfiledirectory(){
    return filedirectory;
}
}
