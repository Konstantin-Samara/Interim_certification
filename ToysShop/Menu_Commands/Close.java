package Interim_certification.ToysShop.Menu_Commands;

import Interim_certification.ToysShop.View;

public class Close implements Options{
View view;
    public Close(View view) {
    this.view = view;}

    @Override
    public String discription() {return "Завершить работу.";}

    @Override
    public void execute() {view.close();}
    
}
