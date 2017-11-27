package info_takjil;
// =====BISMILLAH=====

import java.io.*;

public class Link {

    private int tanggal;
    private String masjid;
    private String alamat;
    public Link next;

    public Link(int tanggal, String masjid, String alamat) {
        this.tanggal = tanggal;
        this.masjid = masjid;
        this.alamat = alamat;
    }

    public int getKey() {
        return tanggal;
    }

    public String getMasjid() {
        return masjid;
    }

    public String getAlamat() {
        return alamat;
    }

    public void displayLink() {
        System.out.print(tanggal + " " + masjid + " | " + alamat);
    }
}
// =====ALHAMDULILLAH=====
