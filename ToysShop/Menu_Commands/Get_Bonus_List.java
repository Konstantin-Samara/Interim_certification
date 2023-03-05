package Interim_certification.ToysShop.Menu_Commands;

import Interim_certification.ToysShop.View;

public class Get_Bonus_List implements Options{
View view;

    public Get_Bonus_List(View view) {this.view = view;}

    @Override
    public String discription() {return "Посмотреть призовой фонд.";}

    @Override
    public void execute() {view.get_bonus_list();}
    
}
