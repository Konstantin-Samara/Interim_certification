package Interim_certification.ToysShop.View_Pack;

import java.util.ArrayList;
import java.util.Scanner;

import Interim_certification.ToysShop.View;

public class Edit_Toy {
    public ArrayList<String> edit_toy(View v) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        int sel,sel1,sel2;
        sel = v.my_input("\nВведите ID игрушки для редактирования : ",
        1,v.presenter.my_shop.getMax_id());
        String name = v.presenter.my_shop.get_toy_id(sel).getName();
        int quantity = v.presenter.my_shop.get_toy_id(sel).getQuantity();
        System.out.println("Редактируется игрушка : "+
        v.presenter.my_shop.get_toy_id(sel).toString());
        sel1 = v.my_input("Хотите изменить название? (1-Да/0-Нет) : ",0,1);
        if (sel1==1) {
            System.out.print("Введите новое название : ");
            name = scan.nextLine();}
        sel2 = v.my_input("Хотите изменить кол-во? (1-Да/0-Нет) : ",0,1);
        if (sel2==1) {
            quantity = v.my_input("Введите новое кол-во : ", 0, 1000000);
          }
        list1.add(Integer.toString(sel));
        list1.add(name);
        list1.add(String.valueOf(quantity));
        return list1;}
}
