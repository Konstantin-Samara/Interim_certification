package Interim_certification.NotePad;

// import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class My_note_book<T extends My_note> implements /*Serializable,*/ Iterable{
    private int max_id;
    private ArrayList<T> notes = new ArrayList<>();
    public Writeable writeable;
    public int getMax_id() {return max_id; }
    public void setMax_id(int max_id) {this.max_id = max_id;}
    public ArrayList<T> getNotes() {return notes;}
    public void setNotes(ArrayList<T> notes) {this.notes = notes;}
    public Writeable getWriteable() {return writeable;}
    public void setWriteable(Writeable writeable) {this.writeable = writeable;}

    @Override
    public Iterator iterator() {return new My_iterator<T>(notes);}

    public T getNote_id(int id) {   
        T my_note = (T) new My_note();
        for (T item : this.notes) {
            if (item.getId()==id) 
                my_note = item;}
        return my_note;}

    public ArrayList<String> get_list_book() {
        ArrayList<String> list1 = new ArrayList<>();
        this.notes.sort(new Date_comparator().reversed());
        for (My_note item : this.notes) 
            list1.add(item.toString());
        return list1;}

    public T get_note_id(int id) {   
        T my_note = (T) new My_note();
        for (T item : this.notes) {
            if (item.getId()==id) 
                my_note = item;}
        return my_note;}

    public ArrayList<String> get_note_info(int id) {return get_note_id(id).to_List();}
    
    public void create_note(ArrayList<String> list1) {
        T my_note = (T) new My_note();
        my_note.birth_date = new Date();
        my_note.id = ++this.max_id;
        my_note.name = list1.get(0);
        my_note.item = list1.get(1);
        this.notes.add(my_note);}

    public void edit_note(ArrayList<String> list1) {
        this.get_note_id(Integer.parseInt(list1.get(0))).setBirth_date(new Date());
        this.get_note_id(Integer.parseInt(list1.get(0))).setName(list1.get(1));
        this.get_note_id(Integer.parseInt(list1.get(0))).setItem(list1.get(2));}
    
    public void delete_note(int del) {
        if (del!=0) {
        this.notes.remove(this.getNote_id(del));
        int Count = 1;
        for (T item : this.notes) {item.setId(Count++);}}}

    // public My_note_book<T> read () {
    //     return writeable.read();}
        
    // public void save() {writeable.save(this);}
}
