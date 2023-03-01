package Interim_certification.NotePad;

import java.util.Comparator;

public class Date_comparator implements Comparator<My_note>{

    @Override
    public int compare(My_note o1, My_note o2) {
        return o1.getBirth_date().compareTo(o2.getBirth_date());}
    
}
