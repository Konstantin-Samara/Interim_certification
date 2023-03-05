package Interim_certification.ToysShop.Menu_Commands;

import Interim_certification.ToysShop.View;

public class Add_toy implements Options{
View view;

public Add_toy(View view) {this.view = view;}

    @Override
    public String discription() {
        return "Добавить новую игрушку.";}

    @Override
    public void execute() {view.add_toy();}
    
}
