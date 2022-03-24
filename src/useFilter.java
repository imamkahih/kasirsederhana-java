
import java.awt.event.KeyEvent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author imamkahih
 */
public class useFilter {
    private validation valid;

    useFilter(validation v) {
        this.valid = v;
    }
    
    boolean filterDigit(KeyEvent n){ // untuk mengcek apakah input itu angka atau bukan
        return this.valid.validDigit(n);
    }
    
}
