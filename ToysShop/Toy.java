package Interim_certification.ToysShop;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Toy {
    int id;
    String name;
    int quantity;
    double weight;
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}
    @Override
    public String toString() {
        NumberFormat form = new DecimalFormat("#0.00");        
        return "ID : " + id + ", наименование : " + name + ", кол-во в наличии : " 
        + quantity + ", попадание в розыгрыш(%)" + form.format(weight) + "%";}
}
