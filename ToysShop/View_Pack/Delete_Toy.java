package Interim_certification.ToysShop.View_Pack;

import Interim_certification.ToysShop.Toy;
import Interim_certification.ToysShop.View;

public class Delete_Toy {
    public int delete_toy(View v) {
        int sel = v.my_input("\nВведите ID игрушки для удаления : ",
        1,v.presenter.my_shop.getMax_id());
        System.out.println(v.presenter.my_shop.get_toy_id(sel).toString());
        int sel1 = v.my_input("Будет удалена, Вы уверены? (1-Да/0-Нет)", 0, 1);
        if (sel1==0){sel = 0;}
        else{
            for (Toy item : v.presenter.bonus_list) {
                if (item.getId()==sel){
                    System.out.println(
                    "\nВы не можете удалить из ассортимента магазина позицию : \nID : "+
                    sel+" Наименование : "+v.presenter.my_shop.get_toy_id(sel).getName()+
                    " т.к. она присутствует в ПРИЗОВОМ ФОНДЕ.\nСначала раздайте ее или"+ 
                    " верните из ПРИЗОВОГО ФОНДА в ассортимент магазина.");
                    sel = 0;}}}
        return sel;}
}
