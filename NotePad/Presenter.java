package Interim_certification.NotePad;

import java.util.ArrayList;

public class Presenter {
    View view = new View(this);
    public My_note_book<My_note> my_note_book = new My_note_book<>();

    void pressButton() {
        // my_note_book.setWriteable(new Write_Read());
        // my_note_book = my_note_book.read();        

        my_note_book = My_read.my_read();
        my_note_book.setWriteable(new Write_Read());

        view.create_Main_menu();        
        view.main_menu();}

    public ArrayList<String> get_list_book() {
        return my_note_book.get_list_book();}

    public ArrayList<String> get_note_info(int id) {
        return my_note_book.get_note_info(id);}

    public void create_note(ArrayList<String> list1) {
        my_note_book.create_note(list1);}

    public void edit_note(ArrayList<String> list1) {
        my_note_book.edit_note(list1);}

    public void delete_note(int del) {
        my_note_book.delete_note(del);}

    public void save_book() {
        My_write.my_write(my_note_book.getNotes());
        // my_note_book.save();
    }


}
