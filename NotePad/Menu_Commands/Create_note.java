package Interim_certification.NotePad.Menu_Commands;

import Interim_certification.NotePad.View;

public class Create_note implements Option{
    View view;
    public Create_note(View view) {
        this.view = view;
    }

    @Override
    public String discription() {
        return "Создать новую заметку.";
    }

    @Override
    public void execute() {view.create_note();}
    
}
