package Interim_certification.ToysShop.Menu_Commands;

import Interim_certification.ToysShop.View;

public class Clear_file implements Options{
View view;
    public Clear_file(View view) {this.view = view;}

    @Override
    public String discription() {return "Очистить файл (gived.txt) выданных призов.";}

    @Override
    public void execute() {view.clear_file();}
    
}
