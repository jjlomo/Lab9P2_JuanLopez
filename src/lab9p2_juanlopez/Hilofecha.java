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
public class Hilofecha extends Thread{
    private JLabel fecha;

    public Hilofecha(JLabel fecha) {
        this.fecha = fecha;
    }

    @Override
    public void run() {
        Date dia=new Date();
       DateFormat f=new SimpleDateFormat("dd:MMM:yy");
            fecha.setText(f.format(dia));
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilohora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
