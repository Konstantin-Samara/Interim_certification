package Interim_certification.NotePad;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class My_write {
    public static void my_write(ArrayList<My_note> notes) {
        try {FileWriter f_w = 
            new FileWriter("Interim_certification//NotePad//notes.txt");
            for (My_note my_note : notes) {
                f_w.append(my_note.getBirth_date().getTime()+" ; ");
                f_w.append(my_note.getName()+" ; ");
                f_w.append(my_note.getItem()+" ; \n");}
            f_w.close();}
        catch(IOException e) {System.out.println("Ошибка ввода-вывода данных.");}




    }
}
