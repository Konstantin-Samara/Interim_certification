package Interim_certification.ToysShop;

import java.util.Comparator;

public class Toy_comparator implements Comparator<Toy>{

    @Override
    public int compare(Toy o1, Toy o2) {
        Double o11 = o1.getWeight();
        Double o21 = o2.getWeight();
        return o11.compareTo(o21);}}
