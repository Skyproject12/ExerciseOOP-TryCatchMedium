/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer2;

/**
 *
 * @author Praktikan
 */
public class Nomer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pertarungan tarung1= new Pertarungan("alex");
       Pertarungan tarung2= new Pertarungan("Popon");
       Thread th = new Thread(tarung1);
       Thread th2=new Thread(tarung2);
       th.start();
       th2.start();
    }
    
}
