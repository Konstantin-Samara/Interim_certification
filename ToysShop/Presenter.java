package Interim_certification.ToysShop;

import java.util.ArrayList;

public class Presenter {
    View v = new View(this);
    public Shop<Toy> my_shop = new Shop<>();
    public Bonus_list bonus = new Bonus_list();
    public ArrayList<Toy> bonus_list = new ArrayList<>();

    public void pressButton() {        
        v.create_main_menu();        
        v.main_menu();}

    public ArrayList<String> get_list_toys() {return my_shop.get_list_toys();}        
    public void add_toy(ArrayList<String> list1) {my_shop.add_toy(list1);}
    public void edit_toy(ArrayList<String> list1) {my_shop.edit_toy(list1);}
    public void delete_toy(int del) {my_shop.delete_toy(del);}
    public ArrayList<String> get_bonus_list() {return bonus.get_bonus_list();}
    public String give_bonus() {return bonus.give_bonus(this);}
    public void clear_file() {My_Write.my_write("", false);}


    public void create_bonus_list(int numb) {
        bonus_list = bonus.create(this, numb);
        my_shop.correct_of_bonus(bonus_list, 0);}

    public void back_bonus_list() {        
        my_shop.correct_of_bonus(bonus_list, 1);
        bonus_list.clear();}
}
