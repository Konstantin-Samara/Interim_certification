package Interim_certification.NotePad.Menu_Commands;

import Interim_certification.NotePad.View;

public class Close implements Option{
View view;
public Close(View view) {
    this.view = view;}

    @Override
    public String discription() {
        return "Завершить работу.";
    }

    @Override
    public void execute() {view.close();}
    
}
