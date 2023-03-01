package Interim_certification.NotePad;

import java.util.ArrayList;
import java.util.Date;

public class My_note {
    int id;
    Date birth_date;
    String name;
    String item;
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getItem() {return item;}
    public void setItem(String item) {this.item = item;}
    public Date getBirth_date() {return birth_date;}
    public void setBirth_date(Date birth_date) {this.birth_date = birth_date;}

@Override
public String toString() {
    return "Id: "+Integer.toString(id)+"    Дата записи: "+birth_date+"    Заголовок : "+name;}

public ArrayList<String> to_List() {
    ArrayList<String> list1 = new ArrayList<>();
    list1.add("\nИдентификатор(ID) : "+this.getId());
    list1.add("Дата : "+this.getBirth_date());
    list1.add("Заголовок : "+this.getName()); 
    list1.add("Содержание : \n"+this.getItem()); 
    return list1;}

}
