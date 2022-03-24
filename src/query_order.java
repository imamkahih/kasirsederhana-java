/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


//import java.awt.List;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author imamkahih
 */
public class query_order extends order_center{
    
    private String[] menu; //penyimpanan sementara data menu yang diambil
    private int total; // untuk menyimpan total harga menu

    @Override
    public String showAllOrder(){ //untuk menampilkan seluruh menu yang sudah di pesan
        query_order qo = new query_order();
        this.total = 0;
        query_menu qMenu = new query_menu();
        String temp = "Menu yang sudah di pesan :\n\n";
        for (int i = 0; i < order_center.order.size(); i++) {
            if(order_center.order.get(i).get(1)!= 0){
                menu = qMenu.getMenu(order_center.order.get(i).get(0));
                temp += menu[0] + "\t" + menu[1] + "\tX" + order_center.order.get(i).get(1) + "\t" + 
                        (order_center.order.get(i).get(1) * qMenu.getIntPrice(menu[1])) +"\n"+ 
                        order_center.description.get(i)+ "\n\n";
                this.total += order_center.order.get(i).get(1) * qMenu.getIntPrice(menu[1]);
            }
        }
        temp += "-------------------------------------------------\n Total : Rp. " + total;
        
        return temp; //dikembalikan dalam type data string
    }
    
    public int totalPayment(){ // untuk mengambil total harga menu yang sudah di pesan
        return total;
    }
}
