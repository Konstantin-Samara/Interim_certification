package Interim_certification.ToysShop.Menu_Commands;

import Interim_certification.ToysShop.View;

public class Edit_toy implements Options{
View view;
public Edit_toy(View view) {this.view = view;}

    @Override
    public String discription() {return "Редактировать игрушку.";}

    @Override
    public void execute() {view.edit_toy();}
    
}
