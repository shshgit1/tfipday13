package tfipday13.day13;

import java.io.File;
import java.io.Serializable;
import java.util.Random;


public class users implements Serializable{
    public String name;
    public String phoneNum;
    public String emailAdd;
    public File filedirectory;
    public String randomGeneratedFilename;

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
public void setfiledirectory(File fileD){
    this.filedirectory=fileD;
}
public String randomer(){
    Random randomchar=new Random();
    String alphanum="abcdefghijklmnopqrstuvwxyz1234567890";
    String randomhexstring="";
    for (int x=0;x<=7;x++){
    char randchar=alphanum.charAt(randomchar.nextInt(alphanum.length()));
        randomhexstring=randomhexstring+randchar;
    }       //end for
    this.randomGeneratedFilename= filedirectory+"\\"+randomhexstring+".txt";    
    return randomGeneratedFilename;
}
}
