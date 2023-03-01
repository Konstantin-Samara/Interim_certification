package Interim_certification.NotePad.Menu_Commands;

import Interim_certification.NotePad.View;

public class Edit_note implements Option{
    View view;
    public Edit_note(View view) {
        this.view = view;}

    @Override
    public String discription() {
        return "Редактировать заметку.";
    }

    @Override
    public void execute() {view.edit_note();}
    
}
