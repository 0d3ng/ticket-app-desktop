/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program.penjualan.tiket.kereta.api;

/**
 *
 * @author Ardy Sendleep
 */
public class ClassProgramTiket {
    public String Nama;
    public String KodeKereta;
    public String NamaKereta;
    public String Jurusan;
    public String JenisTiket;
    public float HargaTiket;
    public float JumlahTiket;
    public float Totalbayar;

    public ClassProgramTiket() {
    }

    public ClassProgramTiket(String Nama, String KodeKereta, String NamaKereta, String Jurusan, String JenisTiket, float HargaTiket, float JumlahTiket, float Totalbayar) {
        this.Nama = Nama;
        this.KodeKereta = KodeKereta;
        this.NamaKereta = NamaKereta;
        this.Jurusan = Jurusan;
        this.JenisTiket = JenisTiket;
        this.HargaTiket = HargaTiket;
        this.JumlahTiket = JumlahTiket;
        this.Totalbayar = Totalbayar;
    }
    
    @Override
    public String toString(){
        return Nama +"-" + KodeKereta +"-" + NamaKereta + "-" + Jurusan +"-" + JenisTiket + "-" + HargaTiket+"-" + JumlahTiket + "-" + Totalbayar;
    }
  }

