package Interim_certification.NotePad;

import java.util.ArrayList;
import java.util.Iterator;

public class My_iterator<T extends My_note> implements Iterator<T>{
    private ArrayList<T> notes;    
    private int id;
    
    public My_iterator(ArrayList<T> notes) {this.notes = notes;}

    @Override
    public boolean hasNext() {return id<notes.size();}

    @Override
    public T next() {return notes.get(id++);}
    
}
