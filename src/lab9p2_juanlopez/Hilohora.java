/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_juanlopez;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author jjlm1
 */
public class Hilohora extends Thread{
    private JLabel hour;

    public Hilohora() {
    }

    public Hilohora(JLabel hour) {
        this.hour = hour;
    }
    

    @Override
    public void run() {
        while (true){
       Date hora=new Date();
       DateFormat f=new SimpleDateFormat("hh:mm:ss");
            hour.setText(f.format(hora));
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilohora.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
    
}
