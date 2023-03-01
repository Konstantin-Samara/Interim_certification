package Interim_certification.NotePad;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class Write_Read implements Writeable, Serializable{

    public void save(My_note_book my_note_book)  {
        try {
            ObjectOutputStream objectOutputStream = 
            new ObjectOutputStream(new FileOutputStream("Interim_certification//NotePad//notes.out"));
            objectOutputStream.writeObject(my_note_book);
            objectOutputStream.close();
        }
    catch(FileNotFoundException e) {System.out.println("Файл не найден.");}
    catch(IOException e) {System.out.println("Ошибка ввода-вывода данных.");}}

    public My_note_book read() {
        My_note_book my_note_book = new My_note_book<>();
        try {
            ObjectInputStream objectInputStream = 
            new ObjectInputStream(new FileInputStream("Interim_certification//NotePad//notes.out"));
            my_note_book = (My_note_book) objectInputStream.readObject();
            objectInputStream.close();
            return my_note_book;}
        catch(FileNotFoundException e) {System.out.println("Файл не найден.");}
        catch(IOException e) {System.out.println("Ошибка ввода-вывода данных.");} 
        catch(ClassNotFoundException e) {System.out.println("Не найден класс - ObjectInputStream.");} 
        return my_note_book;}  
}
