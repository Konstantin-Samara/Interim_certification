package Interim_certification.NotePad.Menu_Commands;

import Interim_certification.NotePad.View;

public class Get_note implements Option{
    View view;
    public Get_note(View view) {
        this.view = view;}

    @Override
    public String discription() {
        return "Вывести заметку с содержанием.";}

    @Override
    public void execute() {view.get_note_info();}
    
}
