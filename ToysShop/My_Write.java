package Interim_certification.ToysShop;

import java.io.FileWriter;
import java.io.IOException;

public class My_Write {
    public static void my_write(String str, boolean b) {
        try {FileWriter f_w = 
            new FileWriter("Interim_certification//ToysShop//gived.txt",b);
            f_w.append(str);
            f_w.close();}
        catch(IOException e) {System.out.println("Ошибка ввода-вывода данных.");}}
}
