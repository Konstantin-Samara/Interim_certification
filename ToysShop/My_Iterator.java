package Interim_certification.ToysShop;

import java.util.ArrayList;
import java.util.Iterator;

public class My_Iterator<T extends Toy> implements Iterator<T>{
    private ArrayList<T> toys;    
    private int id;
    public My_Iterator(ArrayList<T> toys) {this.toys = toys;}

    @Override
    public boolean hasNext() {return id<toys.size();}

    @Override
    public T next() {return toys.get(id++);}
    
}
