package Interim_certification.ToysShop.Menu_Commands;

import Interim_certification.ToysShop.View;

public class Get_List_Toys implements Options{
View view;
    public Get_List_Toys(View view) {this.view = view;}

    @Override
    public String discription() {return "Показать ассортимент магазина.";}

    @Override
    public void execute() {view.get_list_toys();}
    
}
