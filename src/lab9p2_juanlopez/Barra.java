/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_juanlopez;

import javax.swing.JProgressBar;

/**
 *
 * @author jjlm1
 */
public class Barra extends Thread{
    private JProgressBar barra;
    private boolean avanza, vive;

    public Barra(JProgressBar barra, boolean vive) {
        this.barra = barra;
        this.vive = vive;
    }

    public Barra(JProgressBar barra) {
        this.barra = barra;
    }
    

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanza() {
        return avanza;
    }

    public void setAvanza(boolean avanza) {
        this.avanza = avanza;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while(vive){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==100000){
                    vive=false;
                }                
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
