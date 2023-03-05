package Interim_certification.ToysShop.Menu_Commands;

import Interim_certification.ToysShop.View;

public class Back_Bonus_List implements Options{
    View view;

    public Back_Bonus_List(View view) {this.view = view;}

    @Override
    public String discription() {return "Вернуть призовой фонд в ассортимент магазина.";}

    @Override
    public void execute() {view.back_bonus_list();}
    
}
