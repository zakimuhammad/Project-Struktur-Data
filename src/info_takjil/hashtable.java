package info_takjil;
// =====BISMILLAH=====

public class hashtable {

    private SortedList[] hashArray;
    private int size = 30;

    public hashtable() {
        hashArray = new SortedList[size];
        for (int j = 0; j < size; j++) {
            hashArray[j] = new SortedList();
        }
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < size; j++) {
            System.out.print(" " + j + ". ");
            hashArray[j].displayList();
        }
    }

    public int hashFunc(int key) {
        return (key) % size;
    }

    public void insert(int tanggal, String masjid, String alamat) {
        Link theLink = new Link(tanggal, masjid, alamat);
        int key = theLink.getKey();
        int hashVal = hashFunc(key);
        hashArray[hashVal].insert(theLink);
    }

    public Link find(int key) {
        System.out.println("cari: " + key);
        int hashVal = hashFunc(key);
        Link theLink = hashArray[hashVal].find(key);
        System.out.println(hashArray[hashVal].displaymasjid());
        return theLink;
    }

    public SortedList findTgl(int tgl) {
        int hashVal = hashFunc(tgl);
        return hashArray[hashVal];
    }
}
// =====ALHAMDULILLAH=====