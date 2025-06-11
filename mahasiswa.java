/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamahasiswa;

/**
 *
 * @author ARY WIGUNA
 */
public class mahasiswa extends orang{
    protected String nim;
    protected String status;
    protected String prodi;
    protected int tanggallahir;
    
    public mahasiswa(){
    }
    public mahasiswa(String nk, String n, String jk, String nm, String st, String p, int tl){
        super(nk, n, jk);
        nim = nm;
        status = st;
        prodi = p;
        tanggallahir = tl;
    }
    
    public void setnim (String nm){
        nim = nm;
    }
    public void setstatus (String st){
        status = st;
    }
    public void setprodi (String p){
        prodi = p;
    }
    public void settanggallahir (int tl){
        tanggallahir = tl;
    }
    
    public String getnim (){
        return nim;
    }
    public String getstatus (){
        return status;
    }
    public String getprodi (){
        return prodi;
    }
    public int gettanggallahir (){
        return tanggallahir;
    }
    
    @Override
    public void tampilkandata(){
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Jenis Kelamin: " + jeniskelamin);
        System.out.println("NIM: " + nim);
        System.out.println("Status: " + status);
        System.out.println("Prodi: " + prodi);
        System.out.println("Tanggal Lahir: " + tanggallahir);
    }
    
    public static void main(String[] args) {
        mahasiswa new1 = new mahasiswa ("50108051808050003", "Agus", "laki-laki", "2415101041", "mahasiswa", "ilkonn", 10082005);
        new1.tampilkandata();
    }
}
    
