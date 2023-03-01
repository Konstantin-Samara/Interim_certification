package Interim_certification.NotePad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class My_read {

    public static My_note_book my_read()  {
        My_note_book my_note_book = new My_note_book<>();
        ArrayList<My_note> my_note_list = new ArrayList<>();
        ArrayList<String> log_list = new ArrayList<>();
        String[] words;
        int max_id=0;
        try {
            BufferedReader f_r = 
            new BufferedReader(new FileReader("Interim_certification//NotePad//notes.txt"));
            String line;
            while ((line=f_r.readLine())!=null) 
            log_list.add(line); 
        f_r.close();} 
        catch (IOException e) {System.out.println("Ошибка ввода-вывода данных.");}
        
        for (int i = 0; i < log_list.size(); i++) {
            My_note my_note = new My_note();
            Date date = new Date();
            max_id++;
            words = log_list.get(i).split(" ; ");
            my_note.setId(i+1);
            date.setTime(Long.parseLong(words[0],10));
            my_note.setBirth_date(date);
            my_note.setName(words[1]);
            my_note.setItem(words[2]);
            my_note_list.add(my_note);}
        my_note_book.setNotes(my_note_list);
        my_note_book.setMax_id(max_id);
        return my_note_book;}
}
