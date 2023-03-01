package Interim_certification.NotePad.View_Models;

import java.util.ArrayList;
import java.util.Scanner;

import Interim_certification.NotePad.View;

public class Edit_Note {
    
    public ArrayList<String> edit_note(View v) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        int sel,sel1,sel2;
        sel = v.my_input("\nВведите ID записи для редактирования : ",
        1,v.presenter.my_note_book.getMax_id());
        String title = v.presenter.my_note_book.getNote_id(sel).getName();
        String item = v.presenter.my_note_book.getNote_id(sel).getItem();
        System.out.println("Редактируется запись : "+
        v.presenter.my_note_book.getNote_id(sel).toString());
        sel1 = v.my_input("Хотите изменить заголовок? (1-Да/0-Нет) : ",0,1);
        if (sel1==1) {
            System.out.print("Введите новый заголовок : ");
            title = scan.nextLine();}
        sel2 = v.my_input("Хотите изменить содержание? (1-Да/0-Нет) : ",0,1);
        if (sel2==1) {
            System.out.print("Введите новое содержание : ");
            item = scan.nextLine();}
        list1.add(Integer.toString(sel));
        list1.add(title);
        list1.add(item);
        return list1;}
}
