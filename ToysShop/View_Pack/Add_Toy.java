package Interim_certification.ToysShop.View_Pack;

import java.util.ArrayList;
import java.util.Scanner;

import Interim_certification.ToysShop.View;

public class Add_Toy {
    public ArrayList<String> add_toy(View v) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("\nДобавляется игрушка с id : "+(v.presenter.my_shop.getMax_id()+1));
        System.out.print("Введите название : ");
        String name = scan.nextLine(); 
        list1.add(name);
        int quantity = v.my_input("Введите новое кол-во : ", 0, 1000000);
        list1.add(String.valueOf(quantity));
        return list1; }
}
