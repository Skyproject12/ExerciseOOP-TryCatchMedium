/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer2;

import java.util.Random;

/**
 *
 * @author Praktikan
 */
public class Pertarungan implements Runnable {
    private String nama;
    private boolean cek;
    private int healty;

    public Pertarungan(String nama) {
        this.nama = nama;
         healty=25;
    }
    public void run(){
        System.out.println("pemain "+nama+" healty |"+healty);
        for (int i = 0; i < healty; i++) {
               healty=25;
            Random rand = new Random();
            int random =  rand.nextInt(3)+1;
            
            int hp=healty-random;
            int hp2=healty -random;
            if(hp-1==0){
                System.out.println(nama+ "mati ");
                break;
            }
            System.out.println(nama+" terkena "+random+" attack | healty "+(hp-i));
            
        }
    }
    
}
