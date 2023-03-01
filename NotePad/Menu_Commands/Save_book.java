package Interim_certification.NotePad.Menu_Commands;

import Interim_certification.NotePad.View;

public class Save_book implements Option{
    View view;
    public Save_book(View view) {
        this.view = view;}

    @Override
    public String discription() {
        return "Сохранить записную книжку.";}

    @Override
    public void execute() {view.save_book();}
    
}
