package Interim_certification.NotePad;

import java.util.ArrayList;
import java.util.List;

import Interim_certification.NotePad.Menu_Commands.Close;
import Interim_certification.NotePad.Menu_Commands.Create_note;
import Interim_certification.NotePad.Menu_Commands.Delete_note;
import Interim_certification.NotePad.Menu_Commands.Edit_note;
import Interim_certification.NotePad.Menu_Commands.Get_list_book;
import Interim_certification.NotePad.Menu_Commands.Get_note;
import Interim_certification.NotePad.Menu_Commands.Option;
import Interim_certification.NotePad.Menu_Commands.Save_book;
import Interim_certification.NotePad.View_Models.Add_note;
import Interim_certification.NotePad.View_Models.Delete_Note;
import Interim_certification.NotePad.View_Models.Edit_Note;
import Interim_certification.NotePad.View_Models.My_input;

public class View {
   public Presenter presenter; 
   List<Option> command_list = new ArrayList<>();
   Get_list_book command1 = new Get_list_book(this);
   Get_note command2 = new Get_note(this);
   Create_note command3 = new Create_note(this);
   Edit_note command4 = new Edit_note(this);
   Delete_note command5 = new Delete_note(this);
   Save_book command6 = new Save_book(this);
   Close command7 = new Close(this);

public View(Presenter presenter) {
    this.presenter = presenter;}

public void create_Main_menu() {
    command_list.add(command1);
    command_list.add(command2);
    command_list.add(command3);
    command_list.add(command4);
    command_list.add(command5);
    command_list.add(command6);
    command_list.add(command7);}

public void print_list(ArrayList<String> list1) {
    for (String item : list1) {System.out.println(item);}}

public int my_input (String str, int n1, int n2) {       
    return (new My_input()).my_input(str, n1, n2);} 

public void main_menu() {
    int sel = 0;
    while (sel!=command_list.size()) {
        System.out.println();
        for (int index = 1; index <= command_list.size() ; index++) {
            System.out.println(index+". "+command_list.get(index-1).discription());}
        sel = my_input("Выберите пункт меню (1-"+command_list.size()+") : ",
            1,command_list.size());
        command_list.get(sel-1).execute();}}

public void close() {}

public void create_note() {
    presenter.create_note(new Add_note().add_note(this));
    System.out.println("Заметка "
    +presenter.my_note_book.get_note_id(presenter.my_note_book.getMax_id()).toString()
    +" успешно добавлена.");}

public void delete_note() {
    presenter.delete_note(new Delete_Note().delete_note(this));}

public void edit_note() {
    presenter.edit_note(new Edit_Note().edit_note(this));
    System.out.println("Запись успешно отредактирована.");}

public void get_list_book() {
    System.out.println("");
    print_list(presenter.get_list_book());
    System.out.println("");}

public void get_note_info() {
    print_list(presenter.get_note_info(my_input(
        "\nВведите ID записи для получения полной информации : ",
        1,presenter.my_note_book.getMax_id())));}

public void save_book() {presenter.save_book();} 

}
