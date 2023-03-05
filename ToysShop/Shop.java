package Interim_certification.ToysShop;

import java.util.ArrayList;
import java.util.Iterator;

public class Shop<T extends Toy> implements Iterable{
    int max_id;
    int quantity;
    public void setQuantity(int quantity) {this.quantity = quantity;}

    ArrayList<T> toys = new ArrayList<>();

    public int getQuantity() {
        quantity = 0;
        for (T toy : toys) {quantity = quantity+toy.quantity;}
        return quantity; }

    @Override
    public Iterator iterator() {return new My_Iterator<T>(toys);}
    public int getMax_id() {return max_id;}
    public void setMax_id(int max_id) {this.max_id = max_id;}    
    public ArrayList<T> getToys() {return toys;}
    public void setToys(ArrayList<T> toys) {this.toys = toys;}

    public T get_toy_id(int id) {   
        T toy = (T) new Toy();
        for (T item : this.toys) {
            if (item.getId()==id) 
                toy = item;}
        return toy;}

    public void add_toy(ArrayList<String> list1) {
        T toy = (T) new Toy();
        toy.id = ++this.max_id;
        toy.name = list1.get(0);
        toy.quantity = Integer.parseInt(list1.get(1));
        toy.weight = 0;
        this.toys.add(toy);}

    public void edit_toy(ArrayList<String> list1) {
        int ind = Integer.parseInt(list1.get(0));
        this.get_toy_id(ind).setName(list1.get(1));
        int quantity = Integer.parseInt(list1.get(2));
        this.get_toy_id(ind).setQuantity(quantity);}
        
    public void delete_toy(int del) {
        if (del!=0) {this.toys.remove(this.get_toy_id(del));}}

    public ArrayList<String> get_list_toys() {
        ArrayList<String> list1 = new ArrayList<>();
        for (T item : this.toys) 
            list1.add(item.toString());
        return list1;}
    
    public void correct_of_bonus(ArrayList<T> list1, int n) {
        for (T item : this.toys){item.setWeight(0);}
        for (T item : list1) {
            int q;
            if (n==0) 
                {q = this.get_toy_id(item.getId()).getQuantity() - item.getQuantity();}
            else 
                {q = this.get_toy_id(item.getId()).getQuantity() + item.getQuantity();}
            this.get_toy_id(item.getId()).setQuantity(q);
            this.get_toy_id(item.getId()).setWeight(item.getWeight()); }
            quantity = 0;
            for (T item : this.toys){quantity = quantity+item.getQuantity();}
            this.setQuantity(quantity);
        }
    
    
    
}
