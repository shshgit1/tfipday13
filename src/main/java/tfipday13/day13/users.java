package tfipday13.day13;

import java.io.Serializable;

import com.fasterxml.jackson.core.sym.Name;

public class users implements Serializable{
    public String Name;
    public String phoneNum;
public String emailAdd;

public String getName(){
    return this.Name;
}

public String getphoneNum(){
    return this.phoneNum;
}
public String getemailAdd(){
    return this.emailAdd;
}
public void setName(String name){
    name=this.Name;
}
public void setphoneNum(String number){
    this.phoneNum=number;
}
public void setemailAdd(String email){
    this.emailAdd=email;
}
}
