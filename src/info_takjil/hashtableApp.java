package info_takjil;
// =====BISMILLAH=====

public class hashtableApp {
   public static void main(String[] args) {
        hashtable hash = new hashtable();
        hash.insert(30, "masjid A", "jalan - jalan");
        hash.insert(1, "Masjid Agung Jami’", "Jl. Merdeka Barat no 3 Malang");
        hash.insert(1, "Masjid Abu Dzar Al-Ghifari", "Jl. Candi Jolotundo 1 Malang");
        hash.insert(5, "Masjid Sabilillah", "Jl. A Yani no.15 Malang");
        hash.insert(29, "Masjid Sabilillah", "Jl. A Yani no.15 Malang");
        hash.insert(20, "Masjid Sabilillah", "Jl. A Yani no.15 Malang");
        hash.insert(20, "Masjid Agung Jami’", "Jl. Merdeka Barat no 3 Malang");
        hash.insert(20, "Masjid AL-BAROKAH", "JL. PARANGTRITIS KOTA MALANG");
        hash.insert(29, "Masjid SIROTOL MUSTAQIM", "Jl. Jombang IA Malang");
        hash.insert(29, "Masjid DARUL MUTAQIN", "Jl. S. Supriyadi Rt. 04 Rw. 03 Kelurahan Sukun Malang");
        hash.insert(2, "Masjid NURUL IMAN", "Jl. Tirtagangga 23 Malang");
        hash.insert(3, "Masjid NURUL IMAN", "Jl. Tirtagangga 23 Malang");
        hash.insert(2, "Masjid AL-FATAH", "Jl. Brigjen Slamet Riyadi VII Malang");   
        hash.find(1);
        hash.displayTable();
    }
}
// =====ALHAMDULILLAH=====