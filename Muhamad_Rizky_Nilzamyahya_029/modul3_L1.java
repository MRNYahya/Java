/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Muhamad_Rizky_Nilzamyahya_029;

/**
 *
 * @author User
 */

import java.util.stream.*;
public class modul3_L1 
{
    private int num[];
    private double rata_rata;
    private int maksi;
    private int mini;
    private int indeks;
    
    public void setNum(int num[]){
        this.num = num;
        num = null;
    }
    
    public int[] getNum(){
        return num;
    }
    
    public void setRata_Rata(int num[]){
        for (int i = 0; i < num.length; i++) {
            rata_rata = rata_rata += num[i];
        }
        num = null;
    }
    
    public double getRata_Rata(){
        return rata_rata/5;
    }
    
    public void setMaksi(int num[]){
        maksi = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > maksi) {
                maksi = num[i];
            }
        }
    }
    
    public int getMaksi(){
        return maksi;
    }
    
    public void setMini(int num[]){
        mini = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < mini) {
               mini = num[i]; 
            }
        }
        num = null;
    }
    
    public int getMini(){
        return mini;
    }
    
    public void setIndeks(int num[]){
        for (int i = 0; i < num.length; i++) {
            if (num[i] == -3 ) {
                indeks = i;
            }
        }
    }
    
    public int getIndeks(){
        return indeks;
    }
    public void tampil(String a){
        System.out.println(a);
    }
    
    public void tampil(double a){
        System.out.println(a);
    }
    
    public void tampil(int a){
        System.out.println(a);
    }
    
    public void tampil(int a[]){
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i==0) {
                data += a[i];
            } else {
                data += ", " + a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;
    }
    
    public void hapus(){
        num = null;
        rata_rata = 0;
        maksi = 0;
        mini = 0;
        indeks = 0;
    }
}