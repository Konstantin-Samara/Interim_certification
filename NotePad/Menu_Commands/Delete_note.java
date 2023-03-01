package Interim_certification.NotePad.Menu_Commands;

import Interim_certification.NotePad.View;

public class Delete_note implements Option{
    View view;
    public Delete_note(View view) {
        this.view = view;}

    @Override
    public String discription() {
        return "Удалить заметку.";
    }

    @Override
    public void execute() {view.delete_note();}
    
}
