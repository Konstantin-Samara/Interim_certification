package Interim_certification.ToysShop.View_Pack;

import Interim_certification.ToysShop.View;

public class Create_Bonus_List {
    public int create_bonus_list(View v) {
        int numb = 0;
        if (v.presenter.bonus_list.size()==0){
            if (v.presenter.my_shop.getQuantity()>0){
                numb = v.my_input("\nУкажите кол-во игрушек в призовом фонде : ",
                1, v.presenter.my_shop.getQuantity());}
            else 
                {System.out.println("\nВам нечего раздавать - добавьте игрушек в ассортимент.");}}
        else {System.out.println("\nСначала раздайте существующий фонд.");}
        return numb;}}
