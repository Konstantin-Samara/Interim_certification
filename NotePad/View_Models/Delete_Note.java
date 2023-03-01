package Interim_certification.NotePad.View_Models;

import Interim_certification.NotePad.View;

public class Delete_Note {
    public int delete_note(View v) {
        int sel = v.my_input("\nВведите ID записи для удаления : ",
        1,v.presenter.my_note_book.getMax_id());
        v.print_list(v.presenter.my_note_book.get_note_info(sel));
        int sel1 = v.my_input("Будет удалена, Вы уверены? (1-Да/0-Нет)", 0, 1);
        if (sel1==0){sel = 0;}
        return sel;
    }
}
