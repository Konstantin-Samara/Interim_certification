package Interim_certification.ToysShop.Menu_Commands;

import Interim_certification.ToysShop.View;

public class Delete_toy implements Options{
View view;
public Delete_toy(View view) {this.view = view;}

    @Override
    public String discription() {return "Удалить игрушку.";}

    @Override
    public void execute() {view.delete_toy();}
    
}
