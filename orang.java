/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamahasiswa;

/**
 *
 * @author ARY WIGUNA
 */
public abstract class orang {
    protected String nik;
    protected String nama;
    protected String jeniskelamin;
    
    public orang(){
    }
    
    public orang(String nk, String n, String jk){
        nik = nk;
        nama = n;
        jeniskelamin = jk;
    }
    
    public void setnik (String nk){
        nik = nk;
    }
    public void setnama (String n){
        nama = n;
    }
    public void setjeniskelamin (String jk){
        jeniskelamin = jk;
    }
    
    public String setnik (){
        return nik;
    }
    public String setnama (){
        return nama;
    }
    public String setjeniskelamin (){
        return jeniskelamin;
    }
    
    public abstract void tampilkandata();
}


