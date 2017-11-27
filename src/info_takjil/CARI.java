/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info_takjil;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zaki
 */
public class CARI extends javax.swing.JFrame {

    /**
     * Creates new form CARI
     */
    private int tgl;
    private SortedList result;
    public static hashtable hash;
    public static about abot;
    private DefaultTableModel tabelModel;

    public CARI() {
        initComponents();
        hash = new hashtable();
        abot = new about();
        tabelModel = (DefaultTableModel) tblRes.getModel();
        /**
         * load data here
         */
        hash.insert(1, "Masjid Sabilillah ", "Jl. A Yani no.15 Malang");
        hash.insert(2, "Masjid Sabilillah ", "Jl. A Yani no.15 Malang");
        hash.insert(1, "Masjid Agung Jami’", "Jl. Merdeka Barat no 3 Malang");
        hash.insert(1, "Masjid Abu Dzar Al-Ghifari", "Jl. Candi Jolotundo 1 Malang");
        hash.insert(5, "Masjid Sabilillah", "Jl. A Yani no.15 Malang");
        hash.insert(29, "Masjid Sabilillah", "Jl. A Yani no.15 Malang");
        hash.insert(20, "Masjid Sabilillah", "Jl. A Yani no.15 Malang");
        hash.insert(20, "Masjid Agung Jami’", "Jl. Merdeka Barat no 3 Malang");
        hash.insert(2, "Masjid Agung Jami’", "Jl. Merdeka Barat no 3 Malang");
        hash.insert(20, "Masjid AL-BAROKAH", "JL. PARANGTRITIS KOTA MALANG");
        hash.insert(20, "Masjid AL-MUBAROK ", "Jl. Kaliurang Barat Malang");
        hash.insert(15, "Masjid Sabilillah", "Jl. A Yani no.15 Malang");
        hash.insert(5, "Masjid Agung Jami’", "Jl. Merdeka Barat no 3 Malang");
        hash.insert(1, "Masjid NURUL IMAN", "Jl. Tirtagangga 23 Malang");
        hash.insert(1, "Masjid AL-FATAH", "Jl. Brigjen Slamet Riyadi VII Malang");
        hash.insert(5, "Masjid NURUL IMAN", "Jl. Tirtagangga 23 Malang");
        hash.insert(5, "Masjid AL-FATAH", "Jl. Brigjen Slamet Riyadi VII Malang");
        hash.insert(5, "Masjid SIROTOL MUSTAQIM", "Jl. Jombang IA Malang");
        hash.insert(29, "Masjid NURUL IMAN", "Jl. Tirtagangga 23 Malang");
        hash.insert(29, "Masjid AL-FATAH", "Jl. Brigjen Slamet Riyadi VII Malang");
        hash.insert(20, "Masjid NURUL IMAN", "Jl. Tirtagangga 23 Malang");
        hash.insert(29, "Masjid SIROTOL MUSTAQIM", "Jl. Jombang IA Malang");
        hash.insert(29, "Masjid DARUL MUTAQIN", "Jl. S. Supriyadi Rt. 04 Rw. 03 Kelurahan Sukun Malang");
        hash.insert(3, "Masjid NURUL IMAN", "Jl. Tirtagangga 23 Malang");
        hash.insert(2, "Masjid AL-FATAH", "Jl. Brigjen Slamet Riyadi VII Malang");
        hash.insert(6, "Masjid NURUL IMAN", "Jl. Tirtagangga 23 Malang");
        hash.insert(2, "Masjid SIROTOL MUSTAQIM", "Jl. Jombang IA Malang");
        hash.insert(3, "Masjid AL-FATAH", "Jl. Brigjen Slamet Riyadi VII Malang");
        hash.insert(6, "Masjid AL-FATAH", "Jl. Brigjen Slamet Riyadi VII Malang");
        hash.insert(4, "Masjid AL-FATAH", "Jl. Brigjen Slamet Riyadi VII Malang");
        hash.insert(2, "Masjid Assyfa", "Jl. S. Supriyadi Rt. 09 Rw. 02 Kelurahan Sukun Malang");
        hash.insert(3, "Masjid SIROTOL MUSTAQIM", "Jl. Jombang IA Malang");
        hash.insert(3, "Masjid DARUL MUTAQIN", "Jl. S. Supriyadi Rt. 04 Rw. 03 Kelurahan Sukun Malang");
        hash.insert(3, "Masjid Assyfa", "Jl. S. Supriyadi Rt. 09 Rw. 02 Kelurahan Sukun Malang");
        hash.insert(6, "Masjid SIROTOL MUSTAQIM", "Jl. Jombang IA Malang");
        hash.insert(6, "Masjid DARUL MUTAQIN", "Jl. S. Supriyadi Rt. 04 Rw. 03 Kelurahan Sukun Malang");
        hash.insert(6, "Masjid Assyfa", "Jl. S. Supriyadi Rt. 09 Rw. 02 Kelurahan Sukun Malang");
        hash.insert(8, "Masjid Assyfa", "Jl. S. Supriyadi Rt. 09 Rw. 02 Kelurahan Sukun Malang");
        hash.insert(4, "Masjid SIROTOL MUSTAQIM", "Jl. Jombang IA Malang");
        hash.insert(4, "Masjid DARUL MUTAQIN", "Jl. S. Supriyadi Rt. 04 Rw. 03 Kelurahan Sukun Malang");
        hash.insert(4, "Masjid Assyfa", "Jl. S. Supriyadi Rt. 09 Rw. 02 Kelurahan Sukun Malang");
        hash.insert(9, "Masjid Baiturrohim", "11.Jl. Pelabuhan Bakahauni Rt. 03 Rw. 06 Kelurahan Bakalan Krajan Malang");
        hash.insert(7, "Masjid Baiturrohim", "11.Jl. Pelabuhan Bakahauni Rt. 03 Rw. 06 Kelurahan Bakalan Krajan Malang");
        hash.insert(4, "Masjid Baiturrohim", "11.Jl. Pelabuhan Bakahauni Rt. 03 Rw. 06 Kelurahan Bakalan Krajan Malang");
        hash.insert(10, "Masjid Baiturrohim", "11.Jl. Pelabuhan Bakahauni Rt. 03 Rw. 06 Kelurahan Bakalan Krajan Malang");
        hash.insert(11, "Masjid Baiturrohim", "11.Jl. Pelabuhan Bakahauni Rt. 03 Rw. 06 Kelurahan Bakalan Krajan Malang");
        hash.insert(9, "Masjid As-Sakinah", "Perum Cempaka Indah Kelurahan Mulyorejo Malang");
        hash.insert(7, "Masjid Ainul Yakin ", "l. Tebo Selatan Rt.04 Rw.02 Kelurahan Mulyorejo Malang ");
        hash.insert(8, "Masjid Ainul Yakin ", "l. Tebo Selatan Rt.04 Rw.02 Kelurahan Mulyorejo Malang ");
        hash.insert(8, "Masjid As-Sakinah", "Perum Cempaka Indah Kelurahan Mulyorejo Malang");
        hash.insert(10, "Masjid Ainul Yakin ", "l. Tebo Selatan Rt.04 Rw.02 Kelurahan Mulyorejo Malang ");
        hash.insert(11, "Masjid As-Sakinah", "Perum Cempaka Indah Kelurahan Mulyorejo Malang");
        hash.insert(9, "Masjid Nurul Huda", "Jl. Raya Candi V Rt.6 Rw.5 Malang");
        hash.insert(7, "Masjid Darussalam", "Jl. Bandulan II Malang");
        hash.insert(10, "Masjid Darussalam", "Jl. Bandulan II Malang");
        hash.insert(11, "Masjid Nurul Huda", "Jl. Raya Candi V Rt.6 Rw.5 Malang");
        hash.insert(9, "Masjid Arridlo", "Jl. Gamalama Malang");
        hash.insert(7, "Masjid Baitul Salam", "Jl. Gunung Agung Rt.01 Rw.07 Malang ");
        hash.insert(8, "Masjid Baitul Salam", "Jl. Gunung Agung Rt.01 Rw.07 Malang ");
        hash.insert(10, "Masjid Baitul Salam", "Jl. Gunung Agung Rt.01 Rw.07 Malang ");
        hash.insert(11, "Masjid Arridlo", "Jl. Gamalama Malang");
        hash.insert(9, "Masjid Sirotul Jannah", "Jl. Simpang raya Langsep IV / Rt.03 Malang");
        hash.insert(7, "Masjid Attoyyibatul", "Jl. Pisang Candi Barat Rt.2 Rw.4 Malang");
        hash.insert(10, "Masjid Sirotul Jannah", "Jl. Simpang raya Langsep IV / Rt.03 Malang");
        hash.insert(11, "Masjid Sirotul Jannah", "Jl. Simpang raya Langsep IV / Rt.03 Malang");
        hash.insert(16, "Masjid An-Nur", "Jl. Kelapa Sawit Rt.2 Rw.3 Malang");
        hash.insert(13, "Masjid Muslimat", "Jl. Pisang Candi barat Rt.7 Rw.4 Malang");
        hash.insert(12, "Masjid An-Nur", "Jl. Kelapa Sawit Rt.2 Rw.3 Malang");
        hash.insert(15, "Masjid Muslimat", "Jl. Pisang Candi barat Rt.7 Rw.4 Malang");
        hash.insert(14, "Masjid An-Nur", "Jl. Kelapa Sawit Rt.2 Rw.3 Malang");
        hash.insert(16, "Masjid Al-Hikma", "Jl. Simpang Megamendung No.20 Malang");
        hash.insert(13, "Masjid Attaqwa", "Jl. Pisang Agung No.36 Malang");
        hash.insert(12, "Masjid Al-Hidayah", " Jl. Rajabasa No.14 Malang");
        hash.insert(15, "Masjid Al-Hidayah", " Jl. Rajabasa No.14 Malang");
        hash.insert(14, "Masjid Attaqwa", "Jl. Pisang Agung No.36 Malang");
        hash.insert(16, "Masjid Ariadh", "Jl. Pisang Agung III Malang");
        hash.insert(13, "Masjid Ariadh", "Jl. Pisang Agung III Malang");
        hash.insert(12, "Masjid Ariadh", "Jl. Pisang Agung III Malang");
        hash.insert(15, "Masjid Ariadh", "Jl. Pisang Agung III Malang");
        hash.insert(14, "Masjid Ariadh", "Jl. Pisang Agung III Malang");
        hash.insert(8, "Masjid Ariadh", "Jl. Pisang Agung III Malang");
        hash.insert(16, "Masjid Attawabin", "Jl. Krakatau No.14");
        hash.insert(13, "Masjid Babul Hidayah", "Jl. Ir. Rais XIV No.460 Malang");
        hash.insert(12, "Masjid Nurul Iman", " Jl. Terusan Mergan Lori Malang");
        hash.insert(15, "Masjid Al-Falah", " Jl. Ir. Rais XV Malang");
        hash.insert(14, "Masjid Hidayatul Muttakim", " Jl. Ir. Rais IX No. 300B Malang");
        hash.insert(16, "Masjid Daril Muhtadin", "Jl. Ir. Rais IX Malang");
        hash.insert(13, "Masjid Al-Abror", " Jl. Mergen Raya XIX Malang");
        hash.insert(12, "Masjid Daril Muhtadin", "Jl. Ir. Rais IX Malang");
        hash.insert(15, "Masjid Al-Abror", " Jl. Mergen Raya XIX Malang");
        hash.insert(14, "Masjid Daril Muhtadin", "Jl. Ir. Rais IX Malang");
        hash.insert(18, "Masjid Mujahidin", " Jl. Mergan Mushola Malang");
        hash.insert(22, "Masjid Mujahidin", " Jl. Mergan Mushola Malang");
        hash.insert(17, "Masjid  Muthoharun", " Jl. Klayatan III Rt.8 Rw.2 Malang");
        hash.insert(19, "Masjid  Muthoharun", " Jl. Klayatan III Rt.8 Rw.2 Malang");
        hash.insert(21, "Masjid  Muthoharun", " Jl. Klayatan III Rt.8 Rw.2 Malang");
        hash.insert(18, "Masjid Muhajjirin", "Jl. Griyashanta Blok P Malang");
        hash.insert(22, "Masjid Baitul haq", "Jl. Klayatan III Rt.7 Rw.2 Malang");
        hash.insert(17, "Masjid Muhajjirin", "Jl. Griyashanta Blok P Malang");
        hash.insert(19, "Masjid Baitul haq", "Jl. Klayatan III Rt.7 Rw.2 Malang");
        hash.insert(21, "Masjid Muhajjirin", "Jl. Griyashanta Blok P Malang");
        hash.insert(18, "Masjid LDII", " Jl. Klayatan I Rt.2 Rw.1 Malang");
        hash.insert(22, "Masjid LDII", " Jl. Klayatan I Rt.2 Rw.1 Malang");
        hash.insert(17, "Masjid LDII", " Jl. Klayatan I Rt.2 Rw.1 Malang");
        hash.insert(19, "Masjid LDII", " Jl. Klayatan I Rt.2 Rw.1 Malang");
        hash.insert(21, "Masjid LDII", " Jl. Klayatan I Rt.2 Rw.1 Malang");
        hash.insert(18, "Masjid Ashabul Kahfi", " Jl. Remuji Malang");
        hash.insert(22, "Masjid Muqorobun", "Jl. Simbar Menjangan 28 Malang");
        hash.insert(17, "Masjid Muqorobun", "Jl. Simbar Menjangan 28 Malang");
        hash.insert(19, "Masjid Ashabul Kahfi", " Jl. Remuji Malang");
        hash.insert(21, "Masjid Ashabul Kahfi", " Jl. Remuji Malang");
        hash.insert(18, "Masjid Babul jannah", " Jl. Bunga Kumis Kucing Rw.2 Malang");
        hash.insert(22, "Masjid Ahlussunnah Wal Jamaah", "Jl. Kanjuruhan Asri Malang");
        hash.insert(17, "Masjid Babul jannah", " Jl. Bunga Kumis Kucing Rw.2 Malang");
        hash.insert(19, "Masjid Babul jannah", " Jl. Bunga Kumis Kucing Rw.2 Malang");
        hash.insert(21, "Masjid Ahlussunnah Wal Jamaah", "Jl. Kanjuruhan Asri Malang");
        hash.insert(25, "Masjid Al-Fiqri", "Jl. Bukit Permata Hijau Blok A Malang");
        hash.insert(23, "Masjid Al-Fiqri", "Jl. Bukit Permata Hijau Blok A Malang");
        hash.insert(24, "Masjid Al-Fiqri", "Jl. Bukit Permata Hijau Blok A Malang");
        hash.insert(26, "Masjid Al-Fiqri", "Jl. Bukit Permata Hijau Blok A Malang");
        hash.insert(30, "Masjid Al-Fiqri", "Jl. Bukit Permata Hijau Blok A Malang");
        hash.insert(28, "Masjid Al-Fiqri", "Jl. Bukit Permata Hijau Blok A Malang");
        hash.insert(27, "Masjid Al-Fiqri", "Jl. Bukit Permata Hijau Blok A Malang");
        hash.insert(25, "Masjid Fakhruddin (UMM)", "Jl. Tlogomas Rt.5 Rw.7 Malang");
        hash.insert(23, "Masjid Fakhruddin (UMM)", "Jl. Tlogomas Rt.5 Rw.7 Malang");
        hash.insert(24, "Masjid Fakhruddin (UMM)", "Jl. Tlogomas Rt.5 Rw.7 Malang");
        hash.insert(30, "Masjid Fakhruddin (UMM)", "Jl. Tlogomas Rt.5 Rw.7 Malang");
        hash.insert(28, "Masjid Fakhruddin (UMM)", "Jl. Tlogomas Rt.5 Rw.7 Malang");
        hash.insert(27, "Masjid Fakhruddin (UMM)", "Jl. Tlogomas Rt.5 Rw.7 Malang");
        hash.insert(26, "Masjid Fakhruddin (UMM)", "Jl. Tlogomas Rt.5 Rw.7 Malang");
        hash.insert(25, "Masjid Nur Muhammad", "Jl. Piranha atas Rw.03 Malang");
        hash.insert(23, "Masjid As-Syahriyyah", " Jl. Pluto IX Rt.2 Rw.4 Malang");
        hash.insert(24, "Masjid Nur Muhammad", "Jl. Piranha atas Rw.03 Malang");
        hash.insert(30, "Masjid Nur Muhammad", "Jl. Piranha atas Rw.03 Malang");
        hash.insert(28, "Masjid As-Syahriyyah", " Jl. Pluto IX Rt.2 Rw.4 Malang");
        hash.insert(27, "Masjid Nur Muhammad", "Jl. Piranha atas Rw.03 Malang");
        hash.insert(26, "Masjid As-Syahriyyah", " Jl. Pluto IX Rt.2 Rw.4 Malang");
        hash.insert(25, "Masjid Nailul Fallach", "Jl. Tombro Rt.6 Rw.4 Malang");
        hash.insert(23, "Masjid H. Agus Salim", "Jl. Piranha Atas Rt6 Rw.3 Malang");
        hash.insert(24, "Masjid Nailul Fallach", "Jl. Tombro Rt.6 Rw.4 Malang");
        hash.insert(26, "Masjid H. Agus Salim", "Jl. Piranha Atas Rt6 Rw.3 Malang");
        hash.insert(30, "Masjid Pangeran Diponegoro", " Jl. Letjend Sutoyo III / 53 Malang");
        hash.insert(28, "Masjid Banakah", "Jl. Tretes IV Malang");
        hash.insert(27, "Masjid Pangeran Diponegoro", " Jl. Letjend Sutoyo III / 53 Malang");
        hash.insert(26, "Masjid Banakah", "Jl. Tretes IV Malang");
        hash.insert(25, "Masjid Daul Akbar", "Jl. Selorejo 14 Malang");
        hash.insert(23, "Masjid Fadhillah", "Jl. Bungur 9A Malang");
        hash.insert(24, "Masjid Shafaus Salam", "Jl. Selorejo D / 30 Malang");
        hash.insert(26, "Masjid Ali Sarbawi", "Jl. Letjend Sutoyo V Malang");
        hash.insert(30, "Masjid Prahu", " Jl. Selorejo A26 Malang");
        hash.insert(28, "Masjid Ridwanus Sholichin", " Jl. Letjend Sutoyo IV / 40 Malang");
        hash.insert(27, "Masjid Merjosari", "Jl. Mertojoyo Malang");
        hash.insert(26, "Masjid Insan Karim", "Jl. Mertojoyo Selatan B-12 Malang");
        executeSearch();
    }

    /**
     * update var
     */
    public void updateVar() {
        this.tgl = comboTgl.getSelectedIndex() + 1;
        System.out.println(tgl);
        result = hash.findTgl(tgl);
    }

    /**
     * update semua table dari hash
     */
    public void updateTable() {
        tabelModel.setRowCount(0);
        Link current = result.first;
        for (int i = 0; current != null; i++) {
            Object[] row = {current.getMasjid(), current.getAlamat()};
            tabelModel.addRow(row);
            current = current.next;
        }
    }
    /**
     * cari sini
     */
    public void executeSearch() {
        updateVar();
        updateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboTgl = new javax.swing.JComboBox<>();
        panelRes = new javax.swing.JScrollPane();
        tblRes = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("APLIKASI PENCARI TAKJIL");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("UNTUK WILAYAH KOTA MALANG");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Masukkan Tanggal Ramadhan");

        comboTgl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        comboTgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTglActionPerformed(evt);
            }
        });

        tblRes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Masjid", "Alamat"
            }
        ));
        tblRes.setEnabled(false);
        panelRes.setViewportView(tblRes);

        btnAdd.setText("+ Tambahkan");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("About Us");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(panelRes, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRes, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTglActionPerformed
        // TODO add your handling code here:
        executeSearch();
    }//GEN-LAST:event_comboTglActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        new Add().setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        executeSearch();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       new about().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CARI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CARI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CARI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CARI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CARI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> comboTgl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JScrollPane panelRes;
    private javax.swing.JTable tblRes;
    // End of variables declaration//GEN-END:variables
}
