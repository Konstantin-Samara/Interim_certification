package Interim_certification.ToysShop;

import java.util.ArrayList;
import java.util.List;

import Interim_certification.ToysShop.Menu_Commands.Add_toy;
import Interim_certification.ToysShop.Menu_Commands.Back_Bonus_List;
import Interim_certification.ToysShop.Menu_Commands.Clear_file;
import Interim_certification.ToysShop.Menu_Commands.Close;
import Interim_certification.ToysShop.Menu_Commands.Create_bonus_list;
import Interim_certification.ToysShop.Menu_Commands.Delete_toy;
import Interim_certification.ToysShop.Menu_Commands.Edit_toy;
import Interim_certification.ToysShop.Menu_Commands.Get_Bonus_List;
import Interim_certification.ToysShop.Menu_Commands.Get_List_Toys;
import Interim_certification.ToysShop.Menu_Commands.Give_Bonus;
import Interim_certification.ToysShop.Menu_Commands.Options;
import Interim_certification.ToysShop.View_Pack.Add_Toy;
import Interim_certification.ToysShop.View_Pack.Create_Bonus_List;
import Interim_certification.ToysShop.View_Pack.Delete_Toy;
import Interim_certification.ToysShop.View_Pack.Edit_Toy;
import Interim_certification.ToysShop.View_Pack.My_input;

public class View {
    public Presenter presenter; 
    List<Options> command_list = new ArrayList<>();
    Get_List_Toys command1 = new Get_List_Toys(this);
    Add_toy command2 = new Add_toy(this);
    Edit_toy command3 = new Edit_toy(this);
    Delete_toy command4 = new Delete_toy(this);
    Create_bonus_list command5 = new Create_bonus_list(this);
    Get_Bonus_List command6 = new Get_Bonus_List(this);
    Back_Bonus_List command7 = new Back_Bonus_List(this);
    Give_Bonus command8 = new Give_Bonus(this);
    Clear_file command9 = new Clear_file(this);
    Close command10 = new Close(this);

    public View(Presenter presenter) {
        this.presenter = presenter;}

    public void create_main_menu() {
        command_list.add(command1);
        command_list.add(command2);
        command_list.add(command3);
        command_list.add(command4);
        command_list.add(command5);
        command_list.add(command6);
        command_list.add(command7); 
        command_list.add(command8); 
        command_list.add(command9);
        command_list.add(command10);}

    public void main_menu() {
        int sel = 0;
        while (sel!=command_list.size()) {
            System.out.println();
            for (int index = 1; index <= command_list.size() ; index++) {
                System.out.println(index+". "+command_list.get(index-1).discription());}
            sel = my_input("Выберите пункт меню (1-"+command_list.size()+") : ",
                1,command_list.size());
            command_list.get(sel-1).execute();}}

    public void print_list(ArrayList<String> list1) {
        System.out.println("");
        for (String item : list1) {System.out.println(item);}
        System.out.println("");}

    public int my_input (String str, int n1, int n2) {       
        return (new My_input()).my_input(str, n1, n2);} 

    public void delete_toy() {
        presenter.delete_toy(new Delete_Toy().delete_toy(this));}
    
    public void edit_toy() {
        presenter.edit_toy(new Edit_Toy().edit_toy(this));
        System.out.println("Запись успешно отредактирована.");}
    
    public void get_list_toys() {
        System.out.println("\nАССОРТИМЕНТ МАГАЗИНА :");
        print_list(presenter.get_list_toys());}

    public void add_toy() {
        presenter.add_toy(new Add_Toy().add_toy(this));
        System.out.println("\nИгрушка "
        +presenter.my_shop.get_toy_id(presenter.my_shop.getMax_id()).toString()
        +" успешно добавлена.");}

    public void close() {}

    public void create_bonus_list() {
        int numb;
        numb = new Create_Bonus_List().create_bonus_list(this);
        if (numb>0) {presenter.create_bonus_list(numb);}}
      
    public void get_bonus_list() {
        System.out.println("\nПРИЗОВОЙ ФОНД :");
        print_list(presenter.get_bonus_list());}
        
    public void back_bonus_list() {presenter.back_bonus_list();}

    public void give_bonus() {System.out.println(presenter.give_bonus());}

    public void clear_file() {presenter.clear_file();}
        
    
}
