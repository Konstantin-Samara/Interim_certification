package Interim_certification.ToysShop;

import java.util.ArrayList;
import java.util.Random;

public class Bonus_list {
    ArrayList<int[]> bonus_list = new ArrayList<>();
    ArrayList<int[]> mod_bonus_list = new ArrayList<>();
    ArrayList<Toy> res_bonus_list = new ArrayList<>();

    public ArrayList<Toy> create(Presenter p, int numb) {
        mod_bonus_list.clear();
        bonus_list.clear();
        Random rand = new Random();
        int sel,Count;
        ArrayList<Integer> quantity_list = new ArrayList<>();

        for (int i = 0; i < p.my_shop.getToys().size(); i++) {
            quantity_list.add(p.my_shop.getToys().get(i).getQuantity());}

        for (int i = 0; i < numb; i++) {
            int[] str = new int[2];
            sel = rand.nextInt(1, p.my_shop.getQuantity()+1);
            Count = 0;
            int j = 0;
            while (Count<sel) {
                Count = Count+p.my_shop.getToys().get(j).getQuantity();
                j++;}
            
            if (quantity_list.get(j-1)>0)    {
                int quantity = quantity_list.get(j-1)-1;
                str[0] = p.my_shop.getToys().get(j-1).getId();
                str[1] = 1;
                bonus_list.add(str);
                quantity_list.set(j-1, quantity);}
            else i--;}

        for (int i = 0; i < bonus_list.size(); i++) {            
            int[] pos = new int[2];
            int[] pos1 = new int[2];
            int[] nol = new int[2];
            nol[0] = 0;
            nol[1] = 0;
            int quantity = 0;
            pos1 = bonus_list.get(i);
            quantity=pos1[1]; 

            for (int j = i; j < bonus_list.size()-1; j++) {
                int[] pos2 = new int[2];
                pos2=bonus_list.get(j+1);
                if (pos1[0]==pos2[0]) {
                    quantity = quantity+pos2[1];                    
                    bonus_list.set(j+1,nol);}}

            if (pos1[0]!=0&&quantity!=0) {
                pos[0] = pos1[0];
                pos[1] = quantity;
                mod_bonus_list.add(pos);}}        

            res_bonus_list.clear();
        for ( int i = 0; i <  mod_bonus_list.size(); i++) {
            Toy toy = new Toy();
            int[] pos = mod_bonus_list.get(i);
            toy.setId(pos[0]);
            toy.setName(p.my_shop.get_toy_id(pos[0]).getName());
            toy.setQuantity(pos[1]);           
            toy.setWeight((double)pos[1]/(double)numb*100);
            res_bonus_list.add(toy);}

            res_bonus_list.sort(new Toy_comparator().reversed());

        return res_bonus_list;}

    public ArrayList<String> get_bonus_list() {
        ArrayList<String> list1 = new ArrayList<>();
        for (Toy item : res_bonus_list) 
            list1.add(item.toString());
        return list1;
    }

    public String give_bonus(Presenter presenter) {
        String str;
        boolean test;
        test = true;
        Toy toy;
        int i=0;
        int quantity=0;
        str = "\nСформируйте призовой фонд - в нем пусто!";

        while (test&&i<res_bonus_list.size()) {
            if (res_bonus_list.get(i).getQuantity()>0){
                test = false;
                toy = res_bonus_list.get(i);
                quantity = res_bonus_list.get(i).getQuantity()-1;
                res_bonus_list.get(i).setQuantity(quantity);
                str = "\nПриз id : "+toy.getId()+" ; Наименование : "+toy.getName()+" успешно выдан.";
                My_Write.my_write(str, true);}
            else ++i;}
        if (quantity==0&&!test){res_bonus_list.remove(i);}

        return str;}

}
