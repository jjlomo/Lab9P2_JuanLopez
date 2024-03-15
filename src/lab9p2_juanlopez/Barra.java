/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_juanlopez;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author jjlm1
 */
public class Barra extends Thread{
    private JProgressBar barra;
    private boolean avanza, vive;
    private File path;
    private String s="";
    private JTextArea jta;

    public Barra(JProgressBar barra, boolean vive) {
        this.barra = barra;
        this.vive = vive;
    }

    public Barra(JProgressBar barra, boolean avanza, boolean vive, File path, JTextArea jta) {
        this.barra = barra;
        this.avanza = avanza;
        this.vive = vive;
        this.path = path;
        this.jta = jta;
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

    public File getPath() {
        return path;
    }

    public void setPath(File path) {
        this.path = path;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public JTextArea getJta() {
        return jta;
    }

    public void setJta(JTextArea jta) {
        this.jta = jta;
    }

    @Override
    public void run() {
        while(vive){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==100){
                    vive=false;
                    barra.setValue(0);
                }                
            try {
                Thread.sleep(15);
            } catch (InterruptedException ex) {
            }
        }
      //  llenar();
        
    }
//    public void llenar(){
//        File archivo=null;
//        FileReader fr=null;
//        BufferedReader br =null;
//            try {
//                archivo=path;
//                fr=new FileReader(archivo);
//                br=new BufferedReader(fr);
//                String nada="";
//                jta.setText("");
//                while ((nada=br.readLine())!=null){
//                    try{
//                    jta.append(nada+"\n");
//                    }
//                    catch (Exception ex){
//                        ex.printStackTrace();
//                    }
//                }
//            
//        } catch (Exception e) {
//        }
//    }
    
}
