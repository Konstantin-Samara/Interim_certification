package Interim_certification.ToysShop.Menu_Commands;

import Interim_certification.ToysShop.View;

public class Give_Bonus implements Options{
    View view;

    public Give_Bonus(View view) {this.view = view;}

    @Override
    public String discription() {return "Выдать приз из фонда";}

    @Override
    public void execute() {view.give_bonus();}
    
}
