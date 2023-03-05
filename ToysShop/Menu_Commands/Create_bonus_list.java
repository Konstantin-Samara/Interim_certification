package Interim_certification.ToysShop.Menu_Commands;

import Interim_certification.ToysShop.View;

public class Create_bonus_list implements Options{
View view;
    public Create_bonus_list(View view) {this.view = view;}

    @Override
    public String discription() {return "Сформировать призовой фонд.";}

    @Override
    public void execute() {view.create_bonus_list();}
    
}
