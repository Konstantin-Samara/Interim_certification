package Interim_certification.NotePad.Menu_Commands;

import Interim_certification.NotePad.View;

public class Get_list_book implements Option{
    View view;
    public Get_list_book(View view) {
        this.view = view;}

    @Override
    public String discription() {
        return "Вывести список заметок.";}

    @Override
    public void execute() {view.get_list_book();}
    
}
