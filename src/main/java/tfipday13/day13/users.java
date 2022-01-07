package tfipday13.day13;

import java.io.Serializable;

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
}
