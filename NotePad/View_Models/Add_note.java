package Interim_certification.NotePad.View_Models;

import java.util.ArrayList;
import java.util.Scanner;

import Interim_certification.NotePad.View;

public class Add_note {
    public ArrayList<String> add_note(View v) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("Создается заметка "+(v.presenter.my_note_book.getMax_id()+1));
        System.out.print("Введите заголовок : ");
        String title = scan.nextLine(); 
        list1.add(title);
        System.out.print("Введите содержание : ");
        String item = scan.nextLine(); 
        list1.add(item);
        return list1; }
}
